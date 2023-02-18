package com.it.util;

import com.it.pojo.TestLog;

public class StringUtil {

    public static String change(String str){
        String[] split = str.split("（");
        String[] s = split[1].trim().split(" ");
        return s[0];
    }

    public static TestLog give(TestLog testLog){
        String change1 = StringUtil.change(testLog.getFloorCurrent1());
        String change2 = StringUtil.change(testLog.getFloorCurrent2());
        String change3 = StringUtil.change(testLog.getShellCurrent1());
        String change4 = StringUtil.change(testLog.getShellCurrent2());
        String change5 = StringUtil.change(testLog.getPatientCurrent1());
        String change6 = StringUtil.change(testLog.getPatientCurrent2());
        String change7 = StringUtil.change(testLog.getPatientCurrent3());
        String change8 = StringUtil.change(testLog.getPatientCurrent4());
        String change9 = StringUtil.change(testLog.getPatientCurrent5());
        String change10 = StringUtil.change(testLog.getPatientAssistCurrent1());
        String change11 = StringUtil.change(testLog.getPatientAssistCurrent2());
        String change12 = StringUtil.change(testLog.getPatientAssistCurrent3());
        String change13 = StringUtil.change(testLog.getPatientAssistCurrent4());
        String change14 = StringUtil.change(testLog.getImpedance());
        String change15 = StringUtil.change(testLog.getInputPower());

        testLog.setFloorCurrent1(change1);
        testLog.setFloorCurrent2(change2);
        testLog.setShellCurrent1(change3);
        testLog.setShellCurrent2(change4);
        testLog.setPatientCurrent1(change5);
        testLog.setPatientCurrent2(change6);
        testLog.setPatientCurrent3(change7);
        testLog.setPatientCurrent4(change8);
        testLog.setPatientCurrent5(change9);
        testLog.setPatientAssistCurrent1(change10);
        testLog.setPatientAssistCurrent2(change11);
        testLog.setPatientAssistCurrent3(change12);
        testLog.setPatientAssistCurrent4(change13);
        testLog.setImpedance(change14);
        testLog.setInputPower(change15);
        return testLog;
    }
}
