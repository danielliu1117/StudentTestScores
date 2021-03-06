package com.daniel.services;

import java.util.List;

import com.daniel.model.Score;

public interface ScoreService {

	public void addScore(Score score);
	public void updateScore(Score score);
	public void removeScore(Score score);
	public Score getScoreById(int scoreId);
	public List<Score> listScores();
}