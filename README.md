# 로또
## 기능 요구사항
- [x] 로또 구입 금액을 입력하면 구입 금액에 해당하는 로또를 발급해야 한다.
  - [x] LottoBall 을 생성한다.
  - [x] LottoBall 을 가지는 LottoTicket 을 생성한다.
  - [x] LottoTicket 을 묶은 LottoTickets 를 생성한다.
- [x] 로또 1장의 가격은 1000원이다.
- [x] 지난주 당첨번호를 입력하면 구매한 로또의 당첨 통계를 받을 수 있다.
  - [x] WinningLottoNumbers 를 생성한다.
  - [x] LottoTickets 가 가지고 있는 LottoTicket 과 WinningLottoNumbers 을 비교해서 일치하는 숫자의 개수를 구할 수 있다.
  - [x] 구매한 로또에서 일치하는 숫자의 로또 개수와 수익률을 가지는 LottoStat 을 생성한다.
## 실행결과
```
구입금액을 입력해 주세요.
14000
14개를 구매했습니다.
[8, 21, 23, 41, 42, 43]
[3, 5, 11, 16, 32, 38]
[7, 11, 16, 35, 36, 44]
[1, 8, 11, 31, 41, 42]
[13, 14, 16, 38, 42, 45]
[7, 11, 30, 40, 42, 43]
[2, 13, 22, 32, 38, 45]
[23, 25, 33, 36, 39, 41]
[1, 3, 5, 14, 22, 45]
[5, 9, 38, 41, 43, 44]
[2, 8, 9, 18, 19, 21]
[13, 14, 18, 21, 23, 35]
[17, 21, 29, 37, 42, 45]
[3, 8, 27, 30, 35, 44]

지난 주 당첨 번호를 입력해 주세요.
1, 2, 3, 4, 5, 6

당첨 통계
---------
3개 일치 (5000원)- 1개
4개 일치 (50000원)- 0개
5개 일치 (1500000원)- 0개
6개 일치 (2000000000원)- 0개
총 수익률은 0.35입니다.(기준이 1이기 때문에 결과적으로 손해라는 의미임)
```
