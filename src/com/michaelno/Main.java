package com.michaelno;


public class Main {

    public static void main(String[] args) {
        ArithmeticOperator arithmeticOperator = new ArithmeticOperator();
        LogicOperator logicOperator = new LogicOperator();
        InputOutput inputOutput = new InputOutput();
        Condtion condtion = new Condtion();
        Electrical electrical = new Electrical();
        Loop loop = new Loop();
        Array array = new Array();
        Function function = new Function();
        arithmeticOperator.calculate();
        logicOperator.calculate();
        inputOutput.iO();
        condtion.compare();
        electrical.calculateE();
        loop.loop();
        array.array();
        function.main();
        function.main1();
        function.main2();
        function.main3();

    }
}
