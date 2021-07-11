# Note Highlight 

문자열 목록에서 "note" 가 포함된 문자열을 강조하여 출력하는 프로그램을 작성하라 <br/>
정확하게 알파벳 만으로 이루어진 단어만을 확인해야함 <br/>
ex) note1, keynote 와 같은 경우는 원하는 단어가 아니다. <br/>
note 라는 문자열 앞이나 뒤에 숫자 혹은 알파벳이 나오면 다른 단어로 판단한다. <br/>
출력 결과는 note 라는 단어를 강조하기 위해 단어의 앞 뒤에 중괄호 {} 로 감싸준다.

문자열은 알파벳 소문자, 공백, 숫자로만 구성되어 있다.

출력 예시 : 

abc -> abc

note -> {note}

1 note -> 1 {note}

1 note 2 -> 1 {note} 2

keynote -> keynote

ke1note -> ke1note

yes note1 -> yes note1

yes notea -> yes notea

no a note -> no a {note}

no a note anote-> no a {note} anote

no a note note -> no a {note} {note}


