package com.example.service;

import com.example.utils.hangulparser.HangulParser;
import com.example.utils.hangulparser.HangulParserException;
import lombok.Data;
import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Data
public class NameService {

    Set<String> exceptionDictionary = new HashSet<>();
    Set<String> customExceptionDictionary = new HashSet<>();
    Set<String> lastCharterOfFirstNameExceptionDictionary = new HashSet<>();
    Set<String> middleCharterOfFirstNameExceptionDictionary = new HashSet<>();

    List<String> moeumAllowList = new ArrayList<>();
    List<String> jaeumAllowList = new ArrayList<>();

    List<String> lastCharacterFilterList = new ArrayList<>();
    String lastName = "김";

    public List<String> getName() {

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
        return resulFirstNameList;
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
        customExceptionDictionary.add("가");
        customExceptionDictionary.add("두");
        customExceptionDictionary.add("허");
        customExceptionDictionary.add("셰");
        customExceptionDictionary.add("기");
        customExceptionDictionary.add("도");
        customExceptionDictionary.add("해");
        customExceptionDictionary.add("바");
        customExceptionDictionary.add("호");
        customExceptionDictionary.add("구");
        customExceptionDictionary.add("모");
        customExceptionDictionary.add("오");
//        customExceptionDictionary.add("마");
    }
    private void setExceptionDictionary() {
        exceptionDictionary.add("메");
        exceptionDictionary.add("머");
        exceptionDictionary.add("비");
        exceptionDictionary.add("매");
        exceptionDictionary.add("몌");
        exceptionDictionary.add("뷰");
        exceptionDictionary.add("벼");
        exceptionDictionary.add("헤");
        exceptionDictionary.add("녜");
        exceptionDictionary.add("히");
        exceptionDictionary.add("초");
        exceptionDictionary.add("디");
        exceptionDictionary.add("러");
        exceptionDictionary.add("데");
        exceptionDictionary.add("계");
        exceptionDictionary.add("뎨");
        exceptionDictionary.add("게");
        exceptionDictionary.add("보");
        exceptionDictionary.add("네");
        exceptionDictionary.add("졔");
        exceptionDictionary.add("니");
        exceptionDictionary.add("후");
        exceptionDictionary.add("볘");
        exceptionDictionary.add("베");
        exceptionDictionary.add("버");
        exceptionDictionary.add("쳐");
        exceptionDictionary.add("례");
        exceptionDictionary.add("쳬");
        exceptionDictionary.add("거");
        exceptionDictionary.add("개");
        exceptionDictionary.add("거");
        exceptionDictionary.add("너");
        exceptionDictionary.add("누");
        exceptionDictionary.add("뉴");
        exceptionDictionary.add("걔");
        exceptionDictionary.add("교");
        exceptionDictionary.add("내");
        exceptionDictionary.add("노");
        exceptionDictionary.add("뇨");
        exceptionDictionary.add("느");
        exceptionDictionary.add("대");
        exceptionDictionary.add("더");
        exceptionDictionary.add("됴");
        exceptionDictionary.add("르");
        exceptionDictionary.add("로");
        exceptionDictionary.add("내");
        exceptionDictionary.add("배");
        exceptionDictionary.add("부");
        exceptionDictionary.add("무");
        exceptionDictionary.add("저");
    }

    private void setLastCharterOfFirstNameExceptionDictionary(){
        lastCharterOfFirstNameExceptionDictionary.add("하");
        lastCharterOfFirstNameExceptionDictionary.add("래");
        lastCharterOfFirstNameExceptionDictionary.add("루");
        lastCharterOfFirstNameExceptionDictionary.add("사");
        lastCharterOfFirstNameExceptionDictionary.add("유");
        lastCharterOfFirstNameExceptionDictionary.add("자");
        lastCharterOfFirstNameExceptionDictionary.add("재");
        lastCharterOfFirstNameExceptionDictionary.add("조");
        lastCharterOfFirstNameExceptionDictionary.add("래");
        lastCharterOfFirstNameExceptionDictionary.add("혜");
        lastCharterOfFirstNameExceptionDictionary.add("새");
        lastCharterOfFirstNameExceptionDictionary.add("고");
        lastCharterOfFirstNameExceptionDictionary.add("나");
        lastCharterOfFirstNameExceptionDictionary.add("라");
        lastCharterOfFirstNameExceptionDictionary.add("비");
        lastCharterOfFirstNameExceptionDictionary.add("시");
        lastCharterOfFirstNameExceptionDictionary.add("지");
        lastCharterOfFirstNameExceptionDictionary.add("소");
        lastCharterOfFirstNameExceptionDictionary.add("다");
        lastCharterOfFirstNameExceptionDictionary.add("서");
        lastCharterOfFirstNameExceptionDictionary.add("주");
        lastCharterOfFirstNameExceptionDictionary.add("수");
        lastCharterOfFirstNameExceptionDictionary.add("미");
        lastCharterOfFirstNameExceptionDictionary.add("애");
        lastCharterOfFirstNameExceptionDictionary.add("이");
        lastCharterOfFirstNameExceptionDictionary.add("예");
        lastCharterOfFirstNameExceptionDictionary.add("마");
        lastCharterOfFirstNameExceptionDictionary.add("우");
    }

    private void setMiddleCharterOfFirstNameExceptionDictionary(){
        middleCharterOfFirstNameExceptionDictionary.add("나");
        middleCharterOfFirstNameExceptionDictionary.add("래");
        middleCharterOfFirstNameExceptionDictionary.add("리");
        middleCharterOfFirstNameExceptionDictionary.add("미");
        middleCharterOfFirstNameExceptionDictionary.add("사");
        middleCharterOfFirstNameExceptionDictionary.add("새");
        middleCharterOfFirstNameExceptionDictionary.add("하");
        middleCharterOfFirstNameExceptionDictionary.add("자");
        middleCharterOfFirstNameExceptionDictionary.add("애");
        middleCharterOfFirstNameExceptionDictionary.add("조");
        middleCharterOfFirstNameExceptionDictionary.add("혜");
        middleCharterOfFirstNameExceptionDictionary.add("유");
        middleCharterOfFirstNameExceptionDictionary.add("이");
        middleCharterOfFirstNameExceptionDictionary.add("주");
        middleCharterOfFirstNameExceptionDictionary.add("예");
        middleCharterOfFirstNameExceptionDictionary.add("재");
    }

    private void setMoeumAllowList(){
        moeumAllowList.add("ㅏ");
        moeumAllowList.add("ㅐ");
        moeumAllowList.add("ㅓ");
        moeumAllowList.add("ㅗ");
        moeumAllowList.add("ㅜ");
//        moeumAllowList.add("ㅠ");
        moeumAllowList.add("ㅣ");
        moeumAllowList.add("ㅖ");
    }

    private void setJaeumAllowList(){
        jaeumAllowList.add("ㄱ");
        jaeumAllowList.add("ㄴ");
        jaeumAllowList.add("ㄷ");
        jaeumAllowList.add("ㄹ");
        jaeumAllowList.add("ㅁ");
        jaeumAllowList.add("ㅂ");
        jaeumAllowList.add("ㅅ");
        jaeumAllowList.add("ㅇ");
        jaeumAllowList.add("ㅈ");
//        jaeumList.add("ㅊ");
//        jaeumList.add("ㅋ");
//        jaeumList.add("ㅌ");
//        jaeumList.add("ㅍ");
        jaeumAllowList.add("ㅎ");
    }

    private void setSpecialFilter(){
        lastCharacterFilterList.add("아");
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
