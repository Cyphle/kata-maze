package fr.maze;

import fr.maze.domain.MazeGenerator;

public class Main
{
  public static void main(String[] args) {
    MazeGenerator mazeGenerator = new MazeGenerator();
    System.out.println(mazeGenerator.generateMaze(7, 7).toString());
  }
}
