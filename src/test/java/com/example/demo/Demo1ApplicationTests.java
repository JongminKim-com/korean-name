package com.example.demo;

import com.example.utils.hangulparser.HangulParser;
import com.example.utils.hangulparser.HangulParserException;
import org.junit.jupiter.api.Test;
import org.junit.platform.commons.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

class Demo1ApplicationTests {


    @Test
    void contextLoads() {

        setInit();

        List<String> secondTempList = new ArrayList<>();
        jaeumAllowList.forEach(jaeum -> {
            moeumAllowList.forEach(moeum ->{
            List<String> tempList = new ArrayList<>();
                tempList.add(jaeum);
                tempList.add(moeum);
                try {
                    String hangul = HangulParser.assemble(tempList);
                    secondTempList.add(hangul);

                } catch (HangulParserException e) {
                    e.printStackTrace();
                }
            });
        });

        List<String> resulFirstNameList = new ArrayList<>();
        for (String firstCharacter : secondTempList) {
            for (String secondCharacter : secondTempList) {

                String firstName = firstCharacter + secondCharacter;
                if(checkExceptionCharacter(firstName)){continue;}

                if(allowConditionFilter(firstName)){
                    resulFirstNameList.add(firstName);
                    printName(firstName);
                }
            }
        }

        printTotalNameCount(resulFirstNameList);
    }

    private void print(Object s){
        System.out.println(s);
    }
    private void printName(String firstName) {
        print(lastName + firstName);
    }

    private void printTotalNameCount(List<String> resulFirstNameList) {
        print(resulFirstNameList.size());
    }

    private void setInit(){
        setExceptionDictionary();
        setMiddleCharterOfFirstNameExceptionDictionary();
        setLastCharterOfFirstNameExceptionDictionary();
        setMoeumAllowList();
        setJaeumAllowList();
        setSpecialFilter();
        setCustomExceptionDictionary();
    }

    private void setCustomExceptionDictionary(){
        customExceptionDictionary.add("???");
        customExceptionDictionary.add("???");
        customExceptionDictionary.add("???");
        customExceptionDictionary.add("???");
        customExceptionDictionary.add("???");
        customExceptionDictionary.add("???");
        customExceptionDictionary.add("???");
        customExceptionDictionary.add("???");
    }
    private void setExceptionDictionary() {
        exceptionDictionary.add("???");
        exceptionDictionary.add("???");
        exceptionDictionary.add("???");
        exceptionDictionary.add("???");
        exceptionDictionary.add("???");
        exceptionDictionary.add("???");
        exceptionDictionary.add("???");
        exceptionDictionary.add("???");
        exceptionDictionary.add("???");
        exceptionDictionary.add("???");
        exceptionDictionary.add("???");
        exceptionDictionary.add("???");
        exceptionDictionary.add("???");
        exceptionDictionary.add("???");
        exceptionDictionary.add("???");
        exceptionDictionary.add("???");
        exceptionDictionary.add("???");
        exceptionDictionary.add("???");
        exceptionDictionary.add("???");
        exceptionDictionary.add("???");
        exceptionDictionary.add("???");
        exceptionDictionary.add("???");
        exceptionDictionary.add("???");
        exceptionDictionary.add("???");
        exceptionDictionary.add("???");
        exceptionDictionary.add("???");
        exceptionDictionary.add("???");
        exceptionDictionary.add("???");
        exceptionDictionary.add("???");
        exceptionDictionary.add("???");
        exceptionDictionary.add("???");
        exceptionDictionary.add("???");
        exceptionDictionary.add("???");
        exceptionDictionary.add("???");
        exceptionDictionary.add("???");
        exceptionDictionary.add("???");
        exceptionDictionary.add("???");
        exceptionDictionary.add("???");
        exceptionDictionary.add("???");
        exceptionDictionary.add("???");
        exceptionDictionary.add("???");
        exceptionDictionary.add("???");
        exceptionDictionary.add("???");
        exceptionDictionary.add("???");
        exceptionDictionary.add("???");
        exceptionDictionary.add("???");
        exceptionDictionary.add("???");
        exceptionDictionary.add("???");
        exceptionDictionary.add("???");
        exceptionDictionary.add("???");
        exceptionDictionary.add("???");
    }

    private void setLastCharterOfFirstNameExceptionDictionary(){
        lastCharterOfFirstNameExceptionDictionary.add("???");
        lastCharterOfFirstNameExceptionDictionary.add("???");
        lastCharterOfFirstNameExceptionDictionary.add("???");
        lastCharterOfFirstNameExceptionDictionary.add("???");
        lastCharterOfFirstNameExceptionDictionary.add("???");
        lastCharterOfFirstNameExceptionDictionary.add("???");
        lastCharterOfFirstNameExceptionDictionary.add("???");
        lastCharterOfFirstNameExceptionDictionary.add("???");
        lastCharterOfFirstNameExceptionDictionary.add("???");
        lastCharterOfFirstNameExceptionDictionary.add("???");
        lastCharterOfFirstNameExceptionDictionary.add("???");
        lastCharterOfFirstNameExceptionDictionary.add("???");
        lastCharterOfFirstNameExceptionDictionary.add("???");
        lastCharterOfFirstNameExceptionDictionary.add("???");
        lastCharterOfFirstNameExceptionDictionary.add("???");
        lastCharterOfFirstNameExceptionDictionary.add("???");
        lastCharterOfFirstNameExceptionDictionary.add("???");
        lastCharterOfFirstNameExceptionDictionary.add("???");
        lastCharterOfFirstNameExceptionDictionary.add("???");
        lastCharterOfFirstNameExceptionDictionary.add("???");
        lastCharterOfFirstNameExceptionDictionary.add("???");
        lastCharterOfFirstNameExceptionDictionary.add("???");
        lastCharterOfFirstNameExceptionDictionary.add("???");
        lastCharterOfFirstNameExceptionDictionary.add("???");
        lastCharterOfFirstNameExceptionDictionary.add("???");
        lastCharterOfFirstNameExceptionDictionary.add("???");
        lastCharterOfFirstNameExceptionDictionary.add("???");
        lastCharterOfFirstNameExceptionDictionary.add("???");
    }

    private void setMiddleCharterOfFirstNameExceptionDictionary(){
        middleCharterOfFirstNameExceptionDictionary.add("???");
        middleCharterOfFirstNameExceptionDictionary.add("???");
        middleCharterOfFirstNameExceptionDictionary.add("???");
        middleCharterOfFirstNameExceptionDictionary.add("???");
        middleCharterOfFirstNameExceptionDictionary.add("???");
        middleCharterOfFirstNameExceptionDictionary.add("???");
        middleCharterOfFirstNameExceptionDictionary.add("???");
        middleCharterOfFirstNameExceptionDictionary.add("???");
        middleCharterOfFirstNameExceptionDictionary.add("???");
        middleCharterOfFirstNameExceptionDictionary.add("???");
        middleCharterOfFirstNameExceptionDictionary.add("???");
        middleCharterOfFirstNameExceptionDictionary.add("???");
        middleCharterOfFirstNameExceptionDictionary.add("???");
        middleCharterOfFirstNameExceptionDictionary.add("???");
        middleCharterOfFirstNameExceptionDictionary.add("???");
        middleCharterOfFirstNameExceptionDictionary.add("???");
    }

    private void setMoeumAllowList(){
        moeumAllowList.add("???");
        moeumAllowList.add("???");
        moeumAllowList.add("???");
        moeumAllowList.add("???");
        moeumAllowList.add("???");
//        moeumAllowList.add("???");
        moeumAllowList.add("???");
        moeumAllowList.add("???");
    }

    private void setJaeumAllowList(){
        jaeumAllowList.add("???");
        jaeumAllowList.add("???");
        jaeumAllowList.add("???");
        jaeumAllowList.add("???");
        jaeumAllowList.add("???");
        jaeumAllowList.add("???");
        jaeumAllowList.add("???");
        jaeumAllowList.add("???");
        jaeumAllowList.add("???");
//        jaeumList.add("???");
//        jaeumList.add("???");
//        jaeumList.add("???");
//        jaeumList.add("???");
        jaeumAllowList.add("???");
    }

    private void setSpecialFilter(){
        lastCharacterFilterList.add("???");
    }

    private int getLastNameLength(String name){
        return name.length() -1;
    }

    private int getMiddleNameLength(String name){
        return name.length() -2;
    }

    private boolean checkExceptionLastCharacter(String firstName){
        String oneCharter = getOneCharter(firstName, getLastNameLength(firstName), getLastNameLength(firstName) + 1);
        return lastCharterOfFirstNameExceptionDictionary.contains(oneCharter);
    }

    private boolean checkCustomExceptionLastCharacter(String firstName) {
        boolean isContain = false;
        for (char c : firstName.toCharArray()) {
            isContain = isContain || customExceptionDictionary.contains(c + "");
        }
        return isContain;
    }

    private boolean checkExceptionMiddleCharacter(String firstName) {
        String oneCharter = getOneCharter(firstName, getMiddleNameLength(firstName), getMiddleNameLength(firstName) + 1);
        return middleCharterOfFirstNameExceptionDictionary.contains(oneCharter);
    }
    private boolean checkBanCharacter(String firstName){

        boolean isContain = false;
        for (char c : firstName.toCharArray()) {
            isContain = isContain || exceptionDictionary.contains(c + "");
        }

        return isContain;
    }

    private boolean allowConditionFilter(String firstName){
        return lastCharacterFilter(firstName);
    }

    private boolean lastCharacterFilter(String firstName){
        String oneCharter = getOneCharter(firstName, getLastNameLength(firstName), getLastNameLength(firstName) + 1);
        return lastCharacterFilterList.contains(oneCharter);
    }

    private boolean isEqualsWithEveryCharacter(String firstName){
        boolean result = false;
        char temp = '.';
        for (char c : firstName.toCharArray()) {
            result = (temp == c);
            temp = c;
        }

        return result;
    }

    private String getOneCharter(String firstName, int startIndex, int endIndex){
        CharSequence charSequence = firstName.subSequence(startIndex, endIndex);
        return charSequence.toString();
    }

    private boolean checkExceptionCharacter(String firstName){
        return StringUtils.isBlank(firstName)||
                checkExceptionLastCharacter(firstName)
                || checkCustomExceptionLastCharacter(firstName)
                || checkExceptionMiddleCharacter(firstName)
                || checkBanCharacter(firstName)
                || isEqualsWithEveryCharacter(firstName);
    }

}
