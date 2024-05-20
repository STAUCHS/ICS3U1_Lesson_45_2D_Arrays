class E2RelatedArray extends ConsoleProgram {

  /**
  * Description
  * @author:
  */
  
  public void run() {

    double[][] scoringAverages = new double[4][5];
    String[] players = {"Lebron James", "Michael Jordan", "Kobe Bryant", "Kevin Durant" };

    // Lebron James
    scoringAverages[0][0] = 19.1;
    scoringAverages[0][1] = 23.1;
    scoringAverages[0][2] = 26.5;
    scoringAverages[0][3] = 24.1;
    scoringAverages[0][4] = 26.8;

    // Michael Jordan
    scoringAverages[1][0] = 26.5;
    scoringAverages[1][1] = 32.6;
    scoringAverages[1][2] = 33.4;
    scoringAverages[1][3] = 31.2;
    scoringAverages[1][4] = 29.1;

    // Kobe Bryant
    scoringAverages[2][0] = 17.6;
    scoringAverages[2][1] = 21.4;
    scoringAverages[2][2] = 18.9;
    scoringAverages[2][3] = 21.2;
    scoringAverages[2][4] = 25.1;

    // Kevin Durant
    scoringAverages[3][0] = 21.1;
    scoringAverages[3][1] = 23.3;
    scoringAverages[3][2] = 27.5;
    scoringAverages[3][3] = 25.6;
    scoringAverages[3][4] = 26.2;

    System.out.println("\nBASIC PRINTOUT WITH PLAYER NAMES");

    for (int currPlayer = 0; currPlayer < players.length; currPlayer++) {
      // Print out the player name
      System.out.println(players[currPlayer]);
    
      for (int currYear = 0; currYear < scoringAverages[0].length; currYear++) {
        System.out.print("Year " + (currYear + 1) + ": ");
        System.out.println(scoringAverages[currPlayer][currYear]);
      } 
      System.out.println("");
    }
  }
}
