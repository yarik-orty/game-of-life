package io.makefun.gameoflifesimulator;

import java.util.Random;

import static io.makefun.gameoflifesimulator.GameView.WORLD_SIZE;

public class Patterns {

    public static int[][] glider() {
        int[][] arr = new int[WORLD_SIZE][WORLD_SIZE];
        int half = WORLD_SIZE / 2;
        arr[half + 1][half - 1] = 1;
        arr[half + 1][half] = 1;
        arr[half + 1][half + 1] = 1;

        arr[half][half + 1] = 1;
        arr[half - 1][half] = 1;
        return arr;
    }

    public static int[][] gunsGliders() {
        int[][] arr = new int[WORLD_SIZE][WORLD_SIZE];

        int half = WORLD_SIZE / 2;

        arr[half][half] = 1;
        arr[half + 1][half + 1] = 1;
        arr[half + 1][half] = 1;
        arr[half][half + 1] = 1;

        arr[half - 2][half + 32] = 1;
        arr[half - 2 + 1][half + 32 + 1] = 1;
        arr[half - 2 + 1][half + 32] = 1;
        arr[half - 2][half + 32 + 1] = 1;

        arr[half][half + 10] = 1;
        arr[half + 1][half + 10] = 1;
        arr[half + 2][half + 10] = 1;
        arr[half + 3][half + 11] = 1;
        arr[half - 1][half + 11] = 1;
        arr[half + 4][half + 12] = 1;
        arr[half + 4][half + 13] = 1;
        arr[half - 2][half + 12] = 1;
        arr[half - 2][half + 13] = 1;

        arr[half + 1][half + 14] = 1;

        arr[half + 3][half + 15] = 1;
        arr[half - 1][half + 15] = 1;
        arr[half][half + 16] = 1;
        arr[half + 1][half + 16] = 1;
        arr[half + 2][half + 16] = 1;
        arr[half + 1][half + 17] = 1;

        arr[half][half + 20] = 1;
        arr[half - 1][half + 20] = 1;
        arr[half - 2][half + 20] = 1;
        arr[half][half + 21] = 1;
        arr[half - 1][half + 21] = 1;
        arr[half - 2][half + 21] = 1;
        arr[half - 3][half + 22] = 1;
        arr[half + 1][half + 22] = 1;
        arr[half - 3][half + 24] = 1;
        arr[half + 1][half + 24] = 1;
        arr[half - 4][half + 24] = 1;
        arr[half + 2][half + 24] = 1;
        return arr;
    }

    public static int[][] randomGliders() {
        int[][] arr = new int[WORLD_SIZE][WORLD_SIZE];

        int half = WORLD_SIZE / 2;

        arr[half][half] = 1;
        arr[half + 1][half + 1] = 1;
        arr[half + 1][half] = 1;
        arr[half][half + 1] = 1;

        arr[half - 2][half + 32] = 1;
        arr[half - 2 + 1][half + 32 + 1] = 1;
        arr[half - 2 + 1][half + 32] = 1;
        arr[half - 2][half + 32 + 1] = 1;

        arr[half][half + 10] = 1;
        arr[half + 1][half + 10] = 1;
        arr[half + 2][half + 10] = 1;
        arr[half + 3][half + 11] = 1;
        arr[half - 1][half + 11] = 1;
        arr[half + 4][half + 12] = 1;
        arr[half + 4][half + 13] = 1;
        arr[half - 2][half + 12] = 1;
        arr[half - 2][half + 13] = 1;

        arr[half + 1][half + 14] = 1;

        arr[half + 3][half + 15] = 1;
        arr[half - 1][half + 15] = 1;
        arr[half][half + 16] = 1;
        arr[half - 1][half + 16] = 1;
        arr[half - 2][half + 16] = 1;
        arr[half + 1][half + 17] = 1;

        arr[half][half + 20] = 1;
        arr[half - 1][half + 20] = 1;
        arr[half - 2][half + 20] = 1;
        arr[half][half + 21] = 1;
        arr[half - 1][half + 21] = 1;
        arr[half - 2][half + 21] = 1;
        arr[half - 3][half + 22] = 1;
        arr[half + 1][half + 22] = 1;
        arr[half - 3][half + 24] = 1;
        arr[half + 1][half + 24] = 1;
        arr[half - 4][half + 24] = 1;
        arr[half + 2][half + 24] = 1;
        return arr;
    }

    public static int[][] random() {
        int[][] arr = new int[WORLD_SIZE][WORLD_SIZE];

        for (int i = 0; i < WORLD_SIZE * 24; i++) {
            int x = new Random().nextInt(WORLD_SIZE);
            int y = new Random().nextInt(WORLD_SIZE);

            arr[x][y] = 1;
        }

        return arr;
    }
}
