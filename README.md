***
## 🗓️ **초보자를 위한 8일 완성 블로그 개발 로드맵**

| Day | 주제 | 목표 |
| --- | --- | --- |
| **Day 0** | 개발 환경 준비 | Java, IntelliJ, Gradle, Spring Initializr로 환경 세팅 |
| **Day 1** | 프로젝트 초기 구조 및 설정 | 프로젝트 생성, Gradle, yml, MyBatis 설정, 실행 확인 |
| **Day 2** | DB 모델 및 매핑 설정 | Post 테이블 설계 + 모델 + Mapper + XML 작성 |
| **Day 3** | 게시글 등록 / 목록 API | `POST /posts`, `GET /posts` 구현 및 테스트 |
| **Day 4** | 게시글 상세 / 수정 / 삭제 API | `GET /posts/{id}`, `PUT`, `DELETE` 구현 |
| **Day 5** | 프론트엔드 연결 (Thymeleaf or REST + JS) | 간단한 UI에서 글 작성/조회 가능하게 |
| **Day 6** | 사용자 기능 (선택) | 회원가입, 로그인 (기초 수준) |
| **Day 7** | 완성, 점검, 배포 | 전체 점검, H2→MySQL 전환 or 배포(GitHub, Render 등) |

***

## 📌 각 Day별 핵심 계획

***

### ✅ **Day 0 - 개발 환경 준비**

- [ ]  JDK 17 설치
- [ ]  IntelliJ 설치
- [ ]  Gradle 자동 빌드 설정 확인
- [ ]  Spring Initializr로 기본 프로젝트 생성
- [ ]  프로젝트 구조 확인

***

### ✅ **Day 1 - 프로젝트 초기 구조 및 실행 확인**

- [ ]  `build.gradle` 설정 (Web, JDBC, MyBatis, Lombok 등)
- [ ]  `application.yml` 작성 (H2 설정 포함)
- [ ]  `MybatisConfig.java` 설정
- [ ]  패키지 구조 생성 (`controller`, `model`, `mapper`, `service`, `config`)
- [ ]  `MyblogApplication.java` 실행 확인 (`localhost:8080` 404 OK)

***

### ✅ **Day 2 - DB 모델 및 매핑 구성**

- [ ]  `Post` 모델 클래스 생성
- [ ]  `PostMapper.java` 인터페이스 생성
- [ ]  `PostMapper.xml` SQL 작성
- [ ]  `PostService`, `PostServiceImpl` 생성
- [ ]  DB 테스트 (H2 or 실제 DB 연결)

***

### ✅ **Day 3 - 게시글 등록 및 조회 API**

- [ ]  `PostController.java` 생성
- [ ]  `POST /posts` (글 작성)
- [ ]  `GET /posts` (글 목록 조회)
- [ ]  Postman으로 테스트

***

### ✅ **Day 4 - 게시글 상세 / 수정 / 삭제 API**

- [ ]  `GET /posts/{id}` (상세 조회)
- [ ]  `PUT /posts/{id}` (수정)
- [ ]  `DELETE /posts/{id}` (삭제)
- [ ]  예외 처리, 테스트 코드

***

### ✅ **Day 5 - 프론트 UI 연결**

- [ ]  `Thymeleaf` 또는 `HTML + JS + fetch()` 방식 선택
- [ ]  작성 화면, 목록 화면, 상세 화면 연결
- [ ]  최소한의 디자인 적용

***

### ✅ **Day 6 - 회원 기능 구현 (선택)**

- [ ]  `User` 모델 + 테이블 설계
- [ ]  회원가입 / 로그인 기능 (기초 세션 or 메모리)
- [ ]  인증 사용자만 글쓰기 가능하게 제한

***

### ✅ **Day 7 - 점검 및 배포**

- [ ]  전체 기능 점검 및 오류 수정
- [ ]  MySQL로 DB 전환 (선택)
- [ ]  GitHub 커밋 정리
- [ ]  배포 (Render, Vercel, EC2 등 중 선택)

***
