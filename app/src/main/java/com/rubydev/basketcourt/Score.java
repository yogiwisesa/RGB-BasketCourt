package com.rubydev.basketcourt;

/**
 * Created by Yogi Wisesa on 11/5/2017.
 */

public class Score {
    private String team_a;
    private String team_b;
    private int score_a;
    private int score_b;
    private String date;

    public Score(String team_a, String team_b, int score_a, int score_b, String date) {
        this.team_a = team_a;
        this.team_b = team_b;
        this.score_a = score_a;
        this.score_b = score_b;
        this.date = date;
    }

    public String getTeam_a() {
        return team_a;
    }

    public void setTeam_a(String team_a) {
        this.team_a = team_a;
    }

    public String getTeam_b() {
        return team_b;
    }

    public void setTeam_b(String team_b) {
        this.team_b = team_b;
    }

    public int getScore_a() {
        return score_a;
    }

    public void setScore_a(int score_a) {
        this.score_a = score_a;
    }

    public int getScore_b() {
        return score_b;
    }

    public void setScore_b(int score_b) {
        this.score_b = score_b;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
