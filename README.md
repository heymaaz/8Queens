# 8 Queens on Chessboard

The 8 Queens on Chessboard problem is a classic puzzle that involves placing 8 queens on an 8x8 chessboard in such a way that no two queens threaten each other. In other words, no two queens should share the same row, column, or diagonal.

## Problem Statement

The problem can be stated as follows:

Given an 8x8 chessboard, place 8 queens on the board in such a way that no two queens threaten each other. A queen can move horizontally, vertically, and diagonally.

## Solution

There are multiple solutions to the 8 Queens problem, and it can be solved using various algorithms such as backtracking, recursion, and brute force.

One common approach is to use backtracking. The idea is to place a queen in each column, starting from the leftmost column. For each column, we check if the queen can be placed in the current position without conflicting with any previously placed queens. If it can, we move to the next column and repeat the process. If not, we backtrack and try a different position in the current column.

The backtracking algorithm continues this process until all 8 queens are placed on the board without any conflicts. If a solution is found, it is considered valid. If no valid solution is found, the algorithm terminates.

## Usage

To run the 8 Queens on Chessboard program, follow these steps:

1. Clone the repository or download the source code.
2. Open the terminal and navigate to the project directory.
3. Compile and run the program javac

## Contributing

Contributions to this project are welcome. If you have any improvements or suggestions, feel free to open an issue or submit a pull request.

## License

This project is licensed under the [MIT License](LICENSE).
