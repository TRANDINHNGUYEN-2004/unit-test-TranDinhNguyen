package com.example.demo;

import java.util.Arrays;
import java.util.Collections;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
// Issue #3: Unit tests for StudentAnalyzer methods

public class StudentAnalyzerTest {
    private final StudentAnalyzer analyzer = new StudentAnalyzer();

    // Test cases for countExcellentStudents.
    @Test
    public void testCountExcellentStudentsNormalCase() {
        assertEquals(2, analyzer.countExcellentStudents(Arrays.asList(9.0, 8.5, 7.0, 11.0, -1.0)));
    }

    @Test
    public void testCountExcellentStudentsAllValid() {
        assertEquals(3, analyzer.countExcellentStudents(Arrays.asList(8.0, 9.0, 8.5)));
    }

    @Test
    public void testCountExcellentStudentsEmptyList() {
        assertEquals(0, analyzer.countExcellentStudents(Collections.emptyList()));
    }

    @Test
    public void testCountExcellentStudentsAllInvalid() {
        assertEquals(0, analyzer.countExcellentStudents(Arrays.asList(-1.0, 11.0, -5.0)));
    }

    @Test
    public void testCountExcellentStudentsBoundaryCase() {
        assertEquals(2, analyzer.countExcellentStudents(Arrays.asList(8.0, 0.0, 10.0)));
    }

    @Test
    public void testCountExcellentStudentsWithNull() {
        assertEquals(1, analyzer.countExcellentStudents(Arrays.asList(null, 8.5, 7.0)));
    }

    @Test
    public void testCountExcellentStudentsOnlyZeroes() {
        assertEquals(0, analyzer.countExcellentStudents(Arrays.asList(0.0, 0.0)));
    }

    @Test
    public void testCountExcellentStudentsOnlyTens() {
        assertEquals(2, analyzer.countExcellentStudents(Arrays.asList(10.0, 10.0)));
    }

    // Test cases for calculateValidAverage
    @Test
    public void testCalculateValidAverageNormalCase() {
        assertEquals(8.17, analyzer.calculateValidAverage(Arrays.asList(9.0, 8.5, 7.0, 11.0, -1.0)), 0.01);
    }

    @Test
    public void testCalculateValidAverageAllValid() {
        assertEquals(8.5, analyzer.calculateValidAverage(Arrays.asList(8.0, 9.0, 8.5)), 0.01);
    }

    @Test
    public void testCalculateValidAverageEmptyList() {
        assertEquals(0.0, analyzer.calculateValidAverage(Collections.emptyList()), 0.01);
    }

    @Test
    public void testCalculateValidAverageAllInvalid() {
        assertEquals(0.0, analyzer.calculateValidAverage(Arrays.asList(-1.0, 11.0, -5.0)), 0.01);
    }

    @Test
    public void testCalculateValidAverageBoundaryCase() {
        assertEquals(5.0, analyzer.calculateValidAverage(Arrays.asList(0.0, 10.0)), 0.01);
    }

    @Test
    public void testCalculateValidAverageWithNull() {
        assertEquals(7.75, analyzer.calculateValidAverage(Arrays.asList(null, 8.5, 7.0)), 0.01);
    }
    @Test
    void testCountExcellentStudents_NullList() {
        StudentAnalyzer analyzer = new StudentAnalyzer();
        int result = analyzer.countExcellentStudents(null);
        assertEquals(0, result);
    }

    @Test
    void testCountExcellentStudents_EmptyList() {
        StudentAnalyzer analyzer = new StudentAnalyzer();
        int result = analyzer.countExcellentStudents(Collections.emptyList());
        assertEquals(0, result);
    }

    @Test
    void testCalculateValidAverage_NullList() {
        StudentAnalyzer analyzer = new StudentAnalyzer();
        double result = analyzer.calculateValidAverage(null);
        assertEquals(0.0, result);
    }

    @Test
    void testCalculateValidAverage_EmptyList() {
        StudentAnalyzer analyzer = new StudentAnalyzer();
        double result = analyzer.calculateValidAverage(Collections.emptyList());
        assertEquals(0.0, result);
    }

    // Các test bổ sung giúp kiểm thử logic chính
    @Test
    void testCountExcellentStudents_ValidData() {
        StudentAnalyzer analyzer = new StudentAnalyzer();
        int result = analyzer.countExcellentStudents(Arrays.asList(9.0, 8.5, 7.0, null, 10.0));
        assertEquals(3, result);  // 9.0, 8.5, 10.0 hợp lệ
    }

    @Test
    void testCalculateValidAverage_ValidData() {
        StudentAnalyzer analyzer = new StudentAnalyzer();
        double result = analyzer.calculateValidAverage(Arrays.asList(9.0, 8.0, 10.0, null, 11.0));
        assertEquals((9.0 + 8.0 + 10.0) / 3, result);
    }
}