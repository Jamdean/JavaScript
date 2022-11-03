자바와 헷갈릴수있어서 자바 함수도 올렸습니다.

## 함수(function) 

수학의 함수는 입력을 받아 출력을 내보내는 과정을 정의한 것이다.

<h2> 자바스크립트에서 함수란? </h2>

어떤 목적을 가진 작업들을 수행하는 코드들로 모인 블럭

함수 선언을 위해서는 Keyword, name, paramenter(매개변수), body가 필요하다

<h2> 함수의 특징 </h2>

함수는 function 키워드로 시작하고, 실제로는 객체이다.

객체의 특성 덕분에 함수를 변수나 배열에 배정할 수 있다

<h2> 함수 생성 </h2>

1. function statement 함수 선언문


         //function statement
        function a() { console.log('a'); }


2. function expression 함수 표현식


         // function expression
       var b = function () { console.log('b'); };
       var c = () => { console.log('c') };


3. Function 생성자


           // Function 생성자
        var d = new Function("console.log('d')");
