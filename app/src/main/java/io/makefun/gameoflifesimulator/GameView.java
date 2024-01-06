package io.makefun.gameoflifesimulator;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

public class GameView extends View {

    public static final int WORLD_SIZE = 256;

    private int[][] arr = new int[WORLD_SIZE][WORLD_SIZE];

    private Paint blackPaint;
    private Paint whitePaint;

    public GameView(final Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init();
    }

    @Override
    protected void onDraw(final Canvas canvas) {
        super.onDraw(canvas);
        for (int i = 0; i < WORLD_SIZE; i++) {
            for (int j = 0; j < WORLD_SIZE; j++) {
                if (arr[i][j] == 1) {
                    canvas.drawPoint(i, j, blackPaint);
                } else {
                    canvas.drawPoint(i, j, whitePaint);
                }
            }
        }
    }

    public void setupPattern(int[][] arr) {
        this.arr = arr;
        invalidate();
    }

    public void run() {
        game();
        invalidate();
    }

    private void init() {
        blackPaint = new Paint();
        whitePaint = new Paint();

        blackPaint.setStyle(Paint.Style.FILL);
        blackPaint.setColor(Color.BLACK);
        blackPaint.setStrokeWidth(1);

        whitePaint.setStyle(Paint.Style.FILL);
        whitePaint.setColor(Color.WHITE);
        whitePaint.setStrokeWidth(1);
    }

    private void game() {
        int[][] tempArr = new int[WORLD_SIZE][WORLD_SIZE];
        for (int i = 1; i < WORLD_SIZE - 1; i++) {
            for (int j = 1; j < WORLD_SIZE - 1; j++) {
                int neighbours = countNeighbours(i, j);
                if (arr[i][j] == 1) {
                    if (neighbours == 2 || neighbours == 3) {
                        tempArr[i][j] = 1;
                    }
                    if (neighbours >= 4) {
                        tempArr[i][j] = 0;
                    }
                    if (neighbours <= 1) {
                        tempArr[i][j] = 0;
                    }
                } else {
                    if (neighbours == 3) {
                        tempArr[i][j] = 1;
                    }
                }
            }
        }
        arr = tempArr;
    }

    private int countNeighbours(int i, int j) {
        int n = 0;
        if (arr[i - 1][j - 1] == 1) n++;
        if (arr[i - 1][j] == 1) n++;
        if (arr[i - 1][j + 1] == 1) n++;

        if (arr[i + 1][j - 1] == 1) n++;
        if (arr[i + 1][j] == 1) n++;
        if (arr[i + 1][j + 1] == 1) n++;

        if (arr[i][j + 1] == 1) n++;
        if (arr[i][j - 1] == 1) n++;

        return n;
    }

}
