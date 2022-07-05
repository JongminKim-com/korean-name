package com.example.demo;

import com.example.utils.hangulparser.HangulParser;
import com.example.utils.hangulparser.HangulParserException;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

class Demo1ApplicationTests {


    @Test
    void contextLoads() {

        List<String> lastNameList = new ArrayList<>();
        lastNameList.add("ㄱ");
        lastNameList.add("ㅣ");
        lastNameList.add("ㅁ");

        List<String> moeumList = new ArrayList<>();
        moeumList.add("ㅏ");
        moeumList.add("ㅐ");
        moeumList.add("ㅓ");
        moeumList.add("ㅗ");
        moeumList.add("ㅜ");
        moeumList.add("ㅠ");
        moeumList.add("ㅣ");
        moeumList.add("ㅖ");
//        moeumList.add("ㅔ");
//        moeumList.add("ㅕ");
//        moeumList.add("ㅒ");
//        moeumList.add("ㅛ");
//        moeumList.add("ㅡ");
//        moeumList.add("ㅑ");

        List<String> jaeumList = new ArrayList<>();
        jaeumList.add("ㄱ");
        jaeumList.add("ㄴ");
        jaeumList.add("ㄷ");
        jaeumList.add("ㄹ");
        jaeumList.add("ㅁ");
        jaeumList.add("ㅂ");
        jaeumList.add("ㅅ");
        jaeumList.add("ㅇ");
        jaeumList.add("ㅈ");
//        jaeumList.add("ㅊ");
//        jaeumList.add("ㅋ");
//        jaeumList.add("ㅌ");
//        jaeumList.add("ㅍ");
        jaeumList.add("ㅎ");



        List<String> secondTempList = new ArrayList<>();
        jaeumList.forEach(jaeum -> {
            moeumList.forEach(moeum ->{
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
        List<String> temp2 = new ArrayList<>();
        for (String a : secondTempList) {
            for (String b : secondTempList) {
                if (a.equals(b)) {
                    continue;
                }
                String name = "김" + a + b;
                int nameLength = name.length();
                if(name.contains("가")){continue;}
                if(name.contains("거")){continue;}
                if(name.contains("개")){continue;}
                if(name.contains("거")){continue;}
                if(name.contains("너")){continue;}
                if(name.contains("누")){continue;}
                if(name.contains("뉴")){continue;}
                if(name.contains("걔")){continue;}
                if(name.contains("교")){continue;}
                if(name.contains("내")){continue;}
                if(name.contains("노")){continue;}
                if(name.contains("뇨")){continue;}
                if(name.contains("느")){continue;}
                if(name.contains("대")){continue;}
                if(name.contains("더")){continue;}
                if(name.contains("됴")){continue;}
//                if(name.contains("마")){continue;}
                if(name.contains("르")){continue;}
                if(name.contains("로")){continue;}
                if(name.contains("내")){continue;}
                if(name.contains("배")){continue;}
                if(name.contains("부")){continue;}
                if(name.contains("도")){continue;}
                if(name.contains("호")){continue;}
                if(name.contains("무")){continue;}
                if(name.contains("저")){continue;}
                if(name.contains("저")){continue;}
                if(name.contains("츄")){continue;}
                if(name.contains("져")){continue;}
                if(name.contains("쥬")){continue;}
                if(name.contains("혀")){continue;}
                if(name.contains("려")){continue;}
                if(name.contains("겨")){continue;}
                if(name.contains("듀")){continue;}
                if(name.contains("녀")){continue;}
                if(name.contains("뎌")){continue;}
                if(name.contains("허")){continue;}
                if(name.contains("호")){continue;}
                if(name.contains("휴")){continue;}
                if(name.contains("체")){continue;}
                if(name.contains("고")){continue;}
                if(name.contains("차")){continue;}
                if(name.contains("차")){continue;}
                if(name.contains("오")){continue;}
//                if(name.contains("마")){continue;}
                if(name.contains("메")){continue;}
                if(name.contains("몌")){continue;}
                if(name.contains("뷰")){continue;}
                if(name.contains("벼")){continue;}
                if(name.contains("기")){continue;}
                if(name.contains("헤")){continue;}
                if(name.contains("녜")){continue;}
                if(name.contains("히")){continue;}
                if(name.contains("초")){continue;}
                if(name.contains("디")){continue;}
                if(name.contains("구")){continue;}
                if(name.contains("러")){continue;}
                if(name.contains("데")){continue;}
                if(name.contains("계")){continue;}
                if(name.contains("뎨")){continue;}
                if(name.contains("게")){continue;}
                if(name.contains("보")){continue;}
                if(name.contains("네")){continue;}
                if(name.contains("졔")){continue;}
                if(name.contains("니")){continue;}
                if(name.contains("후")){continue;}
                if(name.contains("볘")){continue;}
                if(name.contains("베")){continue;}
                if(name.contains("버")){continue;}
                if(name.contains("쳐")){continue;}
                if(name.contains("례")){continue;}
                if(name.contains("쳬")){continue;}
                if(name.contains("셰")){continue;}
                if(name.contains("셔")){continue;}
                if(name.contains("며")){continue;}
                if(name.contains("매")){continue;}
                if(name.contains("에")){continue;}
                if(name.contains("머")){continue;}
                if(name.contains("뮤")){continue;}
                if(name.contains("모")){continue;}
                if(name.contains("류")){continue;}
                if(name.contains("바")){continue;}
                if(name.contains("해")){continue;}
                if(name.contains("어")){continue;}
                if(name.contains("치")){continue;}
                if(name.contains("두")){continue;}
                if(name.contains("규")){continue;}
                if(name.contains("슈")){continue;}
//                if(name.contains("우")){continue;}
                if(name.contains("다")){continue;}
                if(name.contains("라")){continue;}
                if(name.contains("루")){continue;}
                if(name.contains("비")){continue;}
                // 이름 끝
                if(name.lastIndexOf("하")  == nameLength -1){continue;}
                if(name.lastIndexOf("래")  == nameLength -1){continue;}
                if(name.lastIndexOf("루")  == nameLength -1){continue;}
                if(name.lastIndexOf("사")  == nameLength -1){continue;}
                if(name.lastIndexOf("유")  == nameLength -1){continue;}
                if(name.lastIndexOf("자")  == nameLength -1){continue;}
                if(name.lastIndexOf("재")  == nameLength -1){continue;}
                if(name.lastIndexOf("조")  == nameLength -1){continue;}
                if(name.lastIndexOf("래")  == nameLength -1){continue;}
                if(name.lastIndexOf("혜")  == nameLength -1){continue;}
                if(name.lastIndexOf("새")  == nameLength -1){continue;}
//                if(name.lastIndexOf("리")  == nameLength -1){continue;}
                if(name.lastIndexOf("고")  == nameLength -1){continue;}
                if(name.lastIndexOf("나")  == nameLength -1){continue;}
                if(name.lastIndexOf("라")  == nameLength -1){continue;}
                if(name.lastIndexOf("비")  == nameLength -1){continue;}
                if(name.lastIndexOf("시")  == nameLength -1){continue;}
                if(name.lastIndexOf("지")  == nameLength -1){continue;}
                if(name.lastIndexOf("소")  == nameLength -1){continue;}
                if(name.lastIndexOf("다")  == nameLength -1){continue;}
                if(name.lastIndexOf("서")  == nameLength -1){continue;}
                if(name.lastIndexOf("주")  == nameLength -1){continue;}
                if(name.lastIndexOf("수")  == nameLength -1){continue;}
                if(name.lastIndexOf("미")  == nameLength -1){continue;}
                if(name.lastIndexOf("애")  == nameLength -1){continue;}
                if(name.lastIndexOf("이")  == nameLength -1){continue;}
                if(name.lastIndexOf("예")  == nameLength -1){continue;}
                if(name.lastIndexOf("마")  == nameLength -1){continue;}
                if(name.lastIndexOf("우")  == nameLength -1){continue;}
                // 중간
                if(name.lastIndexOf("나")  == nameLength -2){continue;}
                if(name.lastIndexOf("래")  == nameLength -2){continue;}
                if(name.lastIndexOf("리")  == nameLength -2){continue;}
                if(name.lastIndexOf("미")  == nameLength -2){continue;}
                if(name.lastIndexOf("사")  == nameLength -2){continue;}
                if(name.lastIndexOf("새")  == nameLength -2){continue;}
//                if(name.lastIndexOf("아")  == nameLength -2){continue;}
                if(name.lastIndexOf("하")  == nameLength -2){continue;}
                if(name.lastIndexOf("자")  == nameLength -2){continue;}
                if(name.lastIndexOf("애")  == nameLength -2){continue;}
                if(name.lastIndexOf("조")  == nameLength -2){continue;}
                if(name.lastIndexOf("혜")  == nameLength -2){continue;}
                if(name.lastIndexOf("유")  == nameLength -2){continue;}
                if(name.lastIndexOf("이")  == nameLength -2){continue;}
                if(name.lastIndexOf("주")  == nameLength -2){continue;}
                if(name.lastIndexOf("예")  == nameLength -2){continue;}
                if(name.lastIndexOf("재")  == nameLength -2){continue;}
                if(name.lastIndexOf("아") == name.length() -1){
//                    System.out.println(name);
                }
                System.out.println(name);
                temp2.add(name);
            }

        }
        System.out.println(temp2.size());
    }

}
