package com.example.demo;

import java.util.Arrays;
import java.util.Collections;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
//Issue 3
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
}