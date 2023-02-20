package com.it.pojo;

import lombok.Data;


public class TestLog {

    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    private String operator;
    private String sn;
    private String testName;
    private String floorCurrent1;
    private String floorCurrent2;
    private String shellCurrent1;



    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public String getSn() {
        return sn;
    }

    public void setSn(String sn) {
        this.sn = sn;
    }

    public String getTestName() {
        return testName;
    }

    public void setTestName(String testName) {
        this.testName = testName;
    }

    public String getFloorCurrent1() {
        return floorCurrent1;
    }

    public void setFloorCurrent1(String floorCurrent1) {
        this.floorCurrent1 = floorCurrent1;
    }

    public String getFloorCurrent2() {
        return floorCurrent2;
    }

    public void setFloorCurrent2(String floorCurrent2) {
        this.floorCurrent2 = floorCurrent2;
    }

    public String getShellCurrent1() {
        return shellCurrent1;
    }

    public void setShellCurrent1(String shellCurrent1) {
        this.shellCurrent1 = shellCurrent1;
    }

    public String getShellCurrent2() {
        return shellCurrent2;
    }

    public void setShellCurrent2(String shellCurrent2) {
        this.shellCurrent2 = shellCurrent2;
    }

    public String getPatientCurrent1() {
        return patientCurrent1;
    }

    public void setPatientCurrent1(String patientCurrent1) {
        this.patientCurrent1 = patientCurrent1;
    }

    public String getPatientCurrent2() {
        return patientCurrent2;
    }

    public void setPatientCurrent2(String patientCurrent2) {
        this.patientCurrent2 = patientCurrent2;
    }

    public String getPatientCurrent3() {
        return patientCurrent3;
    }

    public void setPatientCurrent3(String patientCurrent3) {
        this.patientCurrent3 = patientCurrent3;
    }

    public String getPatientCurrent4() {
        return patientCurrent4;
    }

    public void setPatientCurrent4(String patientCurrent4) {
        this.patientCurrent4 = patientCurrent4;
    }

    public String getPatientCurrent5() {
        return patientCurrent5;
    }

    public void setPatientCurrent5(String patientCurrent5) {
        this.patientCurrent5 = patientCurrent5;
    }

    public String getPatientAssistCurrent1() {
        return patientAssistCurrent1;
    }

    public void setPatientAssistCurrent1(String patientAssistCurrent1) {
        this.patientAssistCurrent1 = patientAssistCurrent1;
    }

    public String getPatientAssistCurrent2() {
        return patientAssistCurrent2;
    }

    public void setPatientAssistCurrent2(String patientAssistCurrent2) {
        this.patientAssistCurrent2 = patientAssistCurrent2;
    }

    public String getPatientAssistCurrent3() {
        return patientAssistCurrent3;
    }

    public void setPatientAssistCurrent3(String patientAssistCurrent3) {
        this.patientAssistCurrent3 = patientAssistCurrent3;
    }

    public String getPatientAssistCurrent4() {
        return patientAssistCurrent4;
    }

    public void setPatientAssistCurrent4(String patientAssistCurrent4) {
        this.patientAssistCurrent4 = patientAssistCurrent4;
    }

    public String getImpedance() {
        return impedance;
    }

    public void setImpedance(String impedance) {
        this.impedance = impedance;
    }

    public String getInputPower() {
        return inputPower;
    }

    public void setInputPower(String inputPower) {
        this.inputPower = inputPower;
    }

    private String shellCurrent2;
    private String patientCurrent1;
    private String patientCurrent2;
    private String patientCurrent3;
    private String patientCurrent4;
    private String patientCurrent5;
    private String patientAssistCurrent1;
    private String patientAssistCurrent2;
    private String patientAssistCurrent3;
    private String patientAssistCurrent4;
    private String impedance;
    private String inputPower;

    @Override
    public String toString() {
        return "TestLog{" +

                ", operator='" + operator + '\'' +
                ", sn='" + sn + '\'' +
                ", testName='" + testName + '\'' +
                ", floorCurrent1='" + floorCurrent1 + '\'' +
                ", floorCurrent2='" + floorCurrent2 + '\'' +
                ", shellCurrent1='" + shellCurrent1 + '\'' +
                ", shellCurrent2='" + shellCurrent2 + '\'' +
                ", patientCurrent1='" + patientCurrent1 + '\'' +
                ", patientCurrent2='" + patientCurrent2 + '\'' +
                ", patientCurrent3='" + patientCurrent3 + '\'' +
                ", patientCurrent4='" + patientCurrent4 + '\'' +
                ", patientCurrent5='" + patientCurrent5 + '\'' +
                ", patientAssistCurrent1='" + patientAssistCurrent1 + '\'' +
                ", patientAssistCurrent2='" + patientAssistCurrent2 + '\'' +
                ", patientAssistCurrent3='" + patientAssistCurrent3 + '\'' +
                ", patientAssistCurrent4='" + patientAssistCurrent4 + '\'' +
                ", impedance='" + impedance + '\'' +
                ", inputPower='" + inputPower + '\'' +
                '}';
    }
}
