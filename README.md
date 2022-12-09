# 👮 [캡스톤디자인과창업프로젝트A] 스타트 18팀의 테스트 서버🚔
</br>

## 🚨 한 줄 소개
딥러닝을 기반으로 CCTV를 분석하여 범죄 취약 지역의 범죄행동을 감지하고 자동 신고하는 시스템
</br>

## 🚨 기획 의도
본 시스템은 범죄 취약 지역 내에서 일어나는 강력 범죄 행위를 식별하여 자동으로 경찰에 문자 신고를 함으로써 위험으로부터 지켜줍니다. 본 시스템은 ESG에 기반을 두고 기획된 것으로, 단순 이윤 추구를 넘어 서비스의 대중화 및 상용화를 통해 지역의 범죄 안전망을 구축하는 선한 영향력을 선사하고자 합니다. 단순히 개인 단위에 도움이 되고 돈이 되는 서비스를 넘어, "지속 가능한 사회적 가치를 창출하는 서비스가 되는 것"이 우리가 추구하는 가치입니다.
</br>

## 🚨 실행 방법
</br>

>### 다운로드 및 실행

1. 아래 링크에 따라 github repository에 접근하십시오.
```
https://github.com/Ganghee-Lee-0522/samchong4
```
2. 우상단의 `<>code` 를 눌러 Download ZIP을 선택하고 다운로드하십시오
3. 다운로드한 파일의 압축을 풀고 `samchong4-master/build.gradle` 파일을 여십시오. 이때 IntelliJ를 사용하는 것을 권장합니다.
4. `src/main/java/start18/testservice/Application.java`를 선택하여 build and run 하십시오.
5. 실행이 완전히 완료되는 것(약 1분)을 기다린 후, 웹 브라우저에서 `[localhost:8080](http://localhost:8080)` 에 접속하십시오.
6. 관리자 웹 페이지가 실행되는 것을 확인하실 수 있습니다.
7. 현재 구현된 기능은 관리자 페이지 메인 화면/CCTV 리스트 확인 및 추가/신고 내역 리스트 확인 및 추가 기능입니다.

</br></br>

>### 신고 시스템
딥러닝을 기반으로 CCTV 영상을 분석하여 범죄행동을 감지하고, 식별된 범죄행동을 기반으로 텍스트 신고 데이터를 구성하여 112에 자동 문자 신고 서비스를 제공합니다.

#### 1. 범죄 상황 식별

YOLO와 OpenPose로 폭행, 싸움, 흉기난동, 살인을 탐지합니다. 이상행동 내 동작은 다음과 같습니다.
![image](https://user-images.githubusercontent.com/79368467/206642209-b56dbf7a-193e-426f-8002-49689738107f.png)

<<<<<<< HEAD
`식별 상황 예시 : 납치 상황`
=======
`🔻식별 상황 예시(1) : 폭행 상황`

![폭행](https://user-images.githubusercontent.com/79368467/206645114-510b2f17-037e-4fd9-ba61-dfd968eb9838.gif)

>>>>>>> DL


#### 2. 범죄 상황 문자 신고

범죄 상황이 발생하면 사고 발생 위치, 시각, 이상행동의 종류를 112 문자로 신고 조치합니다.
<<<<<<< HEAD
=======

`🔻문자 신고 예시`

>>>>>>> DL
![image](https://user-images.githubusercontent.com/79368467/206643096-683884bd-577c-41ac-84b4-d5fed8f5cf00.png)

</br></br>

>### 관리자 페이지

관리자 페이지에 접속 후 로그인하면 CCTV 리스트 확인 혹은 신고 리스트 확인 기능 중 원하는 서비스를 선택할 수 있습니다. 화면의 버튼을 누르면 원하는 서비스를 이용할 수 있습니다.

</br></br>

>### CCTV 리스트 확인
>관리 중인 CCTV 정보를 리스트 형태로 열람할 수 있습니다.

#### 1. CCTV 상세 정보 열람
리스트에 있는 개별 CCTV의 상세 정보를 열람할 수 있습니다. 상세 정보에는 CCTV 기종, 설치 위치, 최근 점검 일자, 관리자 등의 정보가 포함됩니다.

#### 2. 신규 CCTV 등록
화면의 CCTV 추가 버튼을 누르면, 등록할 CCTV 정보를 입력할 수 있습니다. 작성 후 하단의 등록 버튼을 눌렀을 때, <span style="color:red">"신규 CCTV 정보가 등록되었습니다."</span> 라는 팝업이 나타나면 등록이 완료된 것입니다. 리스트의 하단에 입력한 정보가 추가된 것을 확인할 수 있습니다.

#### 3. CCTV 정보 수정
리스트에 등록된 CCTV의 정보를 수정할 수 있습니다.

#### 4. CCTV 삭제
리스트에 등록된 CCTV의 정보를 삭제할 수 있습니다.

#### 5. 메인 화면으로 전환
화면의 뒤로 가기 버튼을 누르면 메인 화면으로 이동합니다.

</br></br>

>### 신고 리스트 확인
>과거 신고 기록을 리스트 형태로 열람할 수 있습니다.

#### 1. 신고 상세 정보 열람
리스트에 있는 개별 신고 상세 정보를 열람할 수 있습니다. 상세 정보에는 신고 시 텍스트 변환된 문구, 신고 시간, 신고 위치, 신고 분류, 신고 상황 캡쳐 이미지 등의 정보가 포함됩니다.

#### 2. 신고 수동 등록
화면의 신고 수동 등록 버튼을 누르면, 등록할 신고 정보를 입력할 수 있습니다. 작성 후 하단의 등록 버튼을 눌렀을 때, <span style="color:red">"신고 정보가 등록되었습니다."</span> 라는 팝업이 나타나면 등록이 완료된 것입니다. 리스트의 하단에 입력한 정보가 추가된 것을 확인할 수 있습니다.

#### 3. 신고 정보 수정
리스트에 등록된 신고 정보를 수정할 수 있습니다.

#### 4. 신고 내역 삭제
리스트에 등록된 신고 내역을 삭제할 수 있습니다.

#### 5. 메인 화면으로의 전환
화면의 뒤로 가기 버튼을 누르면 메인 화면으로 이동합니다.

</br></br>

<img width="960" alt="menu page" src="https://user-images.githubusercontent.com/79368467/206182000-e94f1244-ad52-4b78-ba4c-ee520d4c3f46.png">
<img width="960" alt="report page" src="https://user-images.githubusercontent.com/79368467/206182448-6e047500-d418-4234-b31a-7d6a53f766d6.png">
<img width="960" alt="report-modal(no input)" src="https://user-images.githubusercontent.com/79368467/206182461-351206b8-b22b-4a2e-817d-2c1d1c993bd0.png">
<img width="960" alt="report-modal(input)" src="https://user-images.githubusercontent.com/79368467/206182503-fc76f5d1-35b2-4858-89a8-a7e7d090aa46.png">
<img width="960" alt="report-modal-popup" src="https://user-images.githubusercontent.com/79368467/206182550-f18911d4-6c9d-410c-8956-aaee831c8785.png">
<img width="960" alt="report-modal(output)" src="https://user-images.githubusercontent.com/79368467/206182568-9e2bc911-679f-4e09-a29c-7f000c5e3fcc.png">
<img width="960" alt="cctv page" src="https://user-images.githubusercontent.com/79368467/206182589-b33b0f77-18a2-4565-b4fe-40e6f4e3636e.png">
<img width="960" alt="cctv-modal(no input)" src="https://user-images.githubusercontent.com/79368467/206182611-f5a9d24b-2418-4238-ad55-2a2e5540ccfa.png">
<img width="960" alt="cctv-modal(input)" src="https://user-images.githubusercontent.com/79368467/206182624-d4d0b3e2-f7a4-461b-aadb-ecfa0787f558.png">
<img width="960" alt="cctv-modal-popup" src="https://user-images.githubusercontent.com/79368467/206182632-bce7d04a-71c1-49ce-9062-fe36ac819a95.png">
<img width="960" alt="cctv-modal(output)" src="https://user-images.githubusercontent.com/79368467/206182640-ae1a8705-d5d9-49c4-8186-437c82f86232.png">