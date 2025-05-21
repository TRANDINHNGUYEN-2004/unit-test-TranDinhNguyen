package com.example.demo;

import java.util.List;


public class StudentAnalyzer {

    /**
     * Phân tích điểm số và trả về số lượng học sinh đạt loại Giỏi..
     * @param scores danh sách điểm số từ 0 đến 10
     * @return số học sinh đạt loại Giỏi (>= 8.0)
     */
    // issue 1: Improved validation for excellent students
public int countExcellentStudents(List<Double> scores) {
    if (scores == null || scores.isEmpty()) {
        return 0;
    }
    int count = 0;
    for (Double score : scores) {
        if (score != null && score >= 8.0 && score <= 10.0) {
            count++;
        }
    }
    return count;
}

    /**
     * Tính điểm trung bình hợp lệ (từ 0 đến 10)
     * @param scores danh sách điểm
     * @return điểm trung bình của các điểm hợp lệ
     */
    // issue 2
    public double calculateValidAverage(List<Double> scores) {
        if (scores == null || scores.isEmpty()) {
            return 0.0;
        }

        double total = 0.0;
        int count = 0;
        for (Double score : scores) {
            if (score != null && score >= 0.0 && score <= 10.0) {
                total += score;
                count++;
            }
        }
        return count > 0 ? total / count : 0.0;
    }
}