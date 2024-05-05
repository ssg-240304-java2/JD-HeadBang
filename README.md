#  JD-HeadBang
4조

## 🎼 프로젝트 소개
앨범샵으로 유저가 로그인을 해서 가수의 이름이나 노래이름으로 검색해서 구매하는 프로그램입니다.
<br>

## 🕰️ 개발 기간
* 24.04.26일 - 24.04.30일

### 🧑‍🤝‍🧑 멤버구성
 - 팀원1 : 김다빈 - 트랙리스트의 가수, 작곡가, 발매일순으로 출력하는 정렬 기능 구현
 - 팀원2 : 노영록 - 
 - 팀원3 : 송재혁 - 로그인입력과 MenuHandler와 view 부분의 출력 및 노래재생 부분을 구현
 - 팀원4 : 육슬찬 - 
 - 팀원5 : 이창연 -

### ⚙️ 개발 환경
-  ``` Java 17 ```
- ``` JDK-17.0.10+7 ```
- **IDE** : IntelliJ IDEA Ultimate 2023.3.6

### 📂폴더구조
``` 
music
    ├─application
    │      CartService.java
    │      
    ├─comparable
    │  └─sort
    │      ├─album
    │      │      AscPrice.java
    │      │      DescCollectionName.java
    │      │      DescPrice.java
    │      │      
    │      ├─track
    │      │      AscArtistName.java
    │      │      AscReleaseDate.java
    │      │      AscTrackName.java
    │      │      DescArtistName.java
    │      │      DescReleaseDate.java
    │      │      DescTrackName.java
    │      │      
    │      └─track50
    │              AscArtistName.java
    │              AscReleaseDate.java
    │              AscTrackName.java
    │              DescArtistName.java
    │              DescReleaseDate.java
    │              DescTrackName.java
    │              
    ├─domain
    │  │  Cart.java
    │  │  CartItem.java
    │  │  CartRepository.java
    │  │  MyAlbum.java
    │  │  Search.java
    │  │  
    │  └─dto
    │          AlbumDTO.java
    │          TrackDTO.java
    │          
    ├─infrastructure
    │      CartInMemoryRepository.java
    │      
    ├─service
    │      AudioPlayer.java
    │      Database.java
    │      
    └─ui
        └─console
            │  CartController.java
            │  Command.java
            │  CommandHandler.java
            │  MusicApplication.java
            │  PrintList.java
            │  PurchaseCommand.java
            │  SearchCommand.java
            │  SongCommand.java
            │  SortCommand.java
            │  
            └─utils
                    InputUtils.java
```    


## 📌 주요 기능
#### 로그인 - <a href="https://github.com/chaehyuenwoo/SpringBoot-Project-MEGABOX/wiki/%EC%A3%BC%EC%9A%94-%EA%B8%B0%EB%8A%A5-%EC%86%8C%EA%B0%9C(Login)" >상세보기 - WIKI 이동</a>
- ID찾기, PW찾기
- 로그인 시 메뉴접근

#### 검색 - <a href="https://github.com/chaehyuenwoo/SpringBoot-Project-MEGABOX/wiki/%EC%A3%BC%EC%9A%94-%EA%B8%B0%EB%8A%A5-%EC%86%8C%EA%B0%9C(Member)" >상세보기 - WIKI 이동</a>
- iTunes API를 통해 검색어로 노래를 하는 기능을 한다
- 현재 top50에들어가는 노래를 보여준다
- 또 검색을 통해 그노래에 해당하는 앨범을 장바구니에 넣어준다

#### 장바구니 - <a href="https://github.com/chaehyuenwoo/SpringBoot-Project-MEGABOX/wiki/%EC%A3%BC%EC%9A%94-%EA%B8%B0%EB%8A%A5-%EC%86%8C%EA%B0%9C(Member)" >상세보기 - WIKI 이동</a>
- 주소 API 연동
- 회원정보 변경

#### 정렬 - <a href="https://github.com/chaehyuenwoo/SpringBoot-Project-MEGABOX/wiki/%EC%A3%BC%EC%9A%94-%EA%B8%B0%EB%8A%A5-%EC%86%8C%EA%B0%9C(%EC%98%81%ED%99%94-%EC%98%88%EB%A7%A4)" >상세보기 - WIKI 이동</a>
- 트랙리스트의 발매일, 작곡가, 가수를 기준으로 정렬하는 기능을 구현 

#### 음악재생 - <a href="https://github.com/chaehyuenwoo/SpringBoot-Project-MEGABOX/wiki/%EC%A3%BC%EC%9A%94-%EA%B8%B0%EB%8A%A5-%EC%86%8C%EA%B0%9C(%EB%A9%94%EC%9D%B8-Page)" >상세보기 - WIKI 이동</a>
- JavaFX를 이용해서 검색에서 찾은 노래에대한 미리듣기URL로 음악을 재생
-  JavaFX에 대한 특성 때문에 메뉴와 음악재생하는 기능에 대한 쓰레드를 나눴음


