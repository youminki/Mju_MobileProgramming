package com.example.mju_mobileprogramming

fun printFinalTemperature(
    initialMeasurement: Double, // 입력 온도값
    initialUnit: String, // 입력 온도 체계
    finalUnit: String, // 변환할 온도 체계
    conversionFormula: (Double) -> Double // 온도 변환식
) {
    val finalMeasurement = String.format("%.2f", conversionFormula(initialMeasurement)) // 소수점 둘째 자리까지 포맷팅
    println("$initialMeasurement degrees $initialUnit is $finalMeasurement degrees $finalUnit.")
}

fun main() {

    // 1. 섭씨 -> 화씨 변환
    printFinalTemperature(
        initialMeasurement = 27.0,
        initialUnit = "Celsius",
        finalUnit = "Fahrenheit",
        conversionFormula = { celsius -> (celsius * 9 / 5) + 32 }
    )

    // 2. 켈빈 -> 섭씨 변환
    printFinalTemperature(
        initialMeasurement = 350.0,
        initialUnit = "Kelvin",
        finalUnit = "Celsius",
        conversionFormula = { kelvin -> kelvin - 273.15 }
    )

    // 3. 화씨 -> 켈빈 변환
    printFinalTemperature(
        initialMeasurement = 10.0,
        initialUnit = "Fahrenheit",
        finalUnit = "Kelvin",
        conversionFormula = { fahrenheit -> (fahrenheit - 32) * 5 / 9 + 273.15 }
    )
}