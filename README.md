# 인스타그램 급식 자동 업로드 봇

# 요구 사항
- GitHub Actions Runner (Self Hosted)
- Instagram Creator/Business account
- Instagram 2FA OTP Secrets Key

# 포함된 기능
1. 나이스 급식 정보 불러오기
2. 급식을 이미지로 만들기
3. 인스타그램 포스팅
4. GitHub Actions 자동화

# 설치
- 이 repo를 fork 하세요
- fork한 GitHub Actions를 활성화하고 아무거나 push하세요
- 인스타그램 크리에이터, 혹은 비즈니스 계정을 만드세요
- 하단 .env를 참고해서, GitHub에서 Settings의 Security 카테고리의 Secrets > Actions 를 설정하세요
- 마지막으로, GitHub Actions Runner 프로그램을 당신의 컴퓨터에 24시간 작동시켜두세요!

# Secrets
## 필수 시크릿
- TOKEN > GitHub 레포 수정 가능한(자동 jar 빌드 후 게시용) 토큰
- SCHOOL_NAME > 학교명, ex)부산동고등학교
- INSTAGRAM_USERNAME > 인스타그램 아이디, ex)bsdg_meal
- INSTAGRAM_PASSWORD > 인스타그램 비밀번호
## 선택 시크릿(있으면 좋음)
- OTP_SECRET > 인스타그램 2차인증 OTP 비밀키(16자리)
- NEIS_API_KEY > 나이스 API 비밀키
