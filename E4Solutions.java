class E4Solutions extends ConsoleProgram {

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

    // a) Overall scoring average
    double total = 0;
    int numberOfElements = scoringAverages.length * scoringAverages[0].length;
    double overallAvg;

    for (int player = 0; player < scoringAverages.length; player++) {
      for (int year = 0; year < scoringAverages[0].length; year++) {
        total += scoringAverages[player][year];
      }
    }

    overallAvg = total/numberOfElements;

    System.out.printf("%s %.2f \n", "The overall players average in the table is ", overallAvg);

    // b) Highest scoring average, year and plyaer
    double highestAvg = 0;
    int highestPlyr = 0;
    int highestPlyrYear = 0;

    for (int player = 0; player < scoringAverages.length; player++) {
      for (int year = 0; year < scoringAverages[0].length; year++) {

        // Checks if the current average is the highest one
        if (scoringAverages[player][year] > highestAvg){
          highestAvg = scoringAverages[player][year];
          highestPlyr = player;
          highestPlyrYear = year;
        }
      }
    }

    System.out.println(players[highestPlyr] + " had the highest scoring average of " + highestAvg + " in year " + (highestPlyrYear+1) );

    // c) Highest scoring average after 5 years of play
    double currPlayerTotal;
    double currPlayerAvg;
    double highestPlayerAvg = 0;
    highestPlyr = 0;
    
    for (int player = 0; player < scoringAverages.length; player++) {
      
      currPlayerTotal = 0;
    
      for (int year = 0; year < scoringAverages[0].length; year++) {
        currPlayerTotal += scoringAverages[player][year];
      }
      currPlayerAvg = currPlayerTotal/scoringAverages[0].length;
    
      // Check if the current player has the highest 5yr average
      if (currPlayerAvg > highestPlayerAvg) {
        highestPlayerAvg = currPlayerAvg;
        highestPlyr = player;
      }
    }
    
    System.out.printf("%s had the highest 5yr scoring average of %.2f.\n", players[highestPlyr], highestPlayerAvg);

    // d) Year of highest total scoring average
    double currHighestAvg = 0;
    double currTotal;
    double currAvg;
    int highestAvgYear = 0;

    for (int year = 0; year < scoringAverages[0].length; year++) {
      currTotal = 0;
      currAvg = 0;

      for (int player = 0; player < scoringAverages.length; player++ ) {
        currTotal += scoringAverages[player][year];
      }

      currAvg = currTotal/scoringAverages.length;

      if (currAvg > currHighestAvg) {
        currHighestAvg = currAvg;
        highestAvgYear = year;
      }
      
    }
    
    System.out.printf("Year %d yielded the highest total scoring average of %.2f.\n", highestAvgYear, currHighestAvg);
  }
}
