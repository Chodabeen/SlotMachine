# SlotMachine

# H05 - 슬롯머신 만들기

간단한 슬롯 머신을 만들어라. 사용자에게 코인의 개수를 숫자로 입력받은 다음에, 1부터 9까지의 숫자 3개 를 랜덤으로 만들어 3개의 숫자가 같으면 상금으로 코인 4개, 2개의 숫자가 같으면 코인 2개를 더해준다. 한 번 할 때마다 코인을 1개 씩 소모하게 되고, 사용자의 코인이 모두 소모될 때까지 게임을 반복시켜라.

변수는 다음과 같이 사용하라.

int coins; // 사용자의 코인 수. (최초에 입력받음)

int number[] = new int[3]; // 랜덤하게 만들어진 슬롯 머신의 숫자 3개의 리스트

int dummy; // 게임스타트를 위한 의미 없는 입력 숫자

int i; // 반복문을 위한 변수

실행예시
```
Enter number of coins > 5
Start 1th game!!! (Enter any number) > 183
Result of game : 7 8 2 ---> Failed...
There are 4 coins remaining.

Start 2th game!!! (Enter any number) > 155
Result of game : 3 4 7 ---> Failed...
There are 3 coins remaining.

Start 3th game!!! (Enter any number) > 152
Result of game : 6 5 4 ---> Failed...
There are 2 coins remaining.

Start 4th game!!! (Enter any number) > 150
Result of game : 1 4 2 ---> Failed...
There are 1 coins remaining.

Start 5th game!!! (Enter any number) > 130
Result of game : 9 9 9 ---> match 3 numbers! got four more coins
There are 4 coins remaining.

Start 6th game!!! (Enter any number) > 128
Result of game : 7 2 9 ---> Failed...
There are 3 coins remaining.

Start 7th game!!! (Enter any number) > 125
Result of game : 5 3 5 ---> match 2 numbers! got two more coins
There are 4 coins remaining.

Start 8th game!!! (Enter any number) > 122
Result of game : 7 5 5 ---> match 2 numbers! got two more coins
There are 5 coins remaining.

Start 9th game!!! (Enter any number) > 120
Result of game : 1 6 6 ---> match 2 numbers! got two more coins
There are 6 coins remaining.

Start 10th game!!! (Enter any number) > 106
Result of game : 9 7 5 ---> Failed...
There are 5 coins remaining.

Start 11th game!!! (Enter any number) > 105
Result of game : 3 6 4 ---> Failed...
There are 4 coins remaining.

Start 12th game!!! (Enter any number) > 100
Result of game : 7 2 1 ---> Failed...
There are 3 coins remaining.

Start 13th game!!! (Enter any number) > 90
Result of game : 3 1 7 ---> Failed...
There are 2 coins remaining.

Start 14th game!!! (Enter any number) > 88
Result of game : 3 9 9 ---> match 2 numbers! got two more coins
There are 3 coins remaining.

Start 15th game!!! (Enter any number) > 85
Result of game : 9 6 7 ---> Failed...
There are 2 coins remaining.

Start 16th game!!! (Enter any number) > 76
Result of game : 9 6 1 ---> Failed...
There are 1 coins remaining.

Start 17th game!!! (Enter any number) > 75
Result of game : 3 8 4 ---> Failed...
There are 0 coins remaining.

Game over!
```