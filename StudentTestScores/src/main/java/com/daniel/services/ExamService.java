package com.daniel.services;

import java.util.List;

import com.daniel.model.Exam;

public interface ExamService {

	public void addExam(Exam exam);
	public void updateExam(Exam exam);
	public void removeExam(Exam exam);
	public Exam getExamById(int examId);
	public List<Exam> listExams();
}