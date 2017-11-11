package com.example.android.broncosscore;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

  int scoreOppTeam = 0;
  int scoreBroncos = 0;
  int reset = 0;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
  }
  /**
   * Displays the given score for Opposing Team.
   */
  public void displayForOppTeam (int score) {
    TextView scoreView = (TextView) findViewById(R.id.opposing_team_score);
    scoreView.setText(String.valueOf(score));
  }

  /**
   * Displays touchdown points
   */

  public void addOppTeamTouchdown (View view) {
    scoreOppTeam += 6;
    displayForOppTeam(scoreOppTeam);
  }

  /**
   * Displays Extra Point Kick
   */

  public void addOppTeamExtraPoint (View view) {
    scoreOppTeam += 1;
    displayForOppTeam(scoreOppTeam);
  }

  /**
   * Displays Go for 2
   */

  public void addOppTeamTwoPoints (View view) {
    scoreOppTeam += 2;
    displayForOppTeam(scoreOppTeam);
  }

  /**
   * Displays Field Goal
   */
  public void addOppTeamFieldGoal (View view) {
    scoreOppTeam += 3;
    displayForOppTeam(scoreOppTeam);
  }

  /**
   * Displays Safety
   */

  public void addOppTeamSafety (View view) {
    scoreOppTeam += 2;
    displayForOppTeam(scoreOppTeam);
  }

  public void displayForBroncos (int score) {
    TextView scoreView = (TextView) findViewById(R.id.broncos_score);
    scoreView.setText(String.valueOf(score));
  }
  /**
   * Displays Touchdown
   */

  public void addBroncosTouchdown (View view) {
    scoreBroncos += 6;
    displayForBroncos(scoreBroncos);
  }

  /**
   * Displays Extra Point Kick
   */

  public void addBroncosExtraPoint (View view) {
    scoreBroncos += 1;
    displayForBroncos(scoreBroncos);
  }

  /**
   * Displays Go for 2
   */

  public void addBroncosTwoPoints (View view) {
    scoreBroncos += 2;
    displayForBroncos(scoreBroncos);
  }
  /**
   * Displays Field Goal
   */

  public void addBroncosFieldGoal (View view) {
    scoreBroncos += 3;
    displayForBroncos(scoreBroncos);
  }
  /**
   * Displays Safety
   */

  public void addBroncosSafety (View view) {
    scoreBroncos += 2;
    displayForBroncos(scoreBroncos);
  }

  /** Resets scores for both teams back to 0 */

  public void reset (View view) {
    scoreOppTeam = 0;
    scoreBroncos = 0;
    displayForOppTeam(scoreOppTeam);
    displayForBroncos(scoreBroncos);
  }
}

