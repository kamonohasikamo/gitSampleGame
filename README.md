# gitSampleGame
Gitの練習用サンプルプログラム

Javaで書かれています．チーム開発の体験用に作成しているので設計がかなりひどくなっているので参考にしないでください．

## フォルダ構成
- MainGame.java  ：　メインクラスのJavaファイル
- Status.java    ：　Playerのステータスクラス
- Add~.java      ：　ステータスをインクリメントするメソッドが書かれたクラス
- Sub~.java      ：　ステータスをデクリメントするメソッドが書かれたクラス

## 実行方法
本フォルダ直下で
```java:compile
javac -encoding UTF-8 -g *.java
```
としたあと，
```java:run
java MainGame
```
とすれば実行できます．

バッチファイルも作っておいたので
run.batをダブルクリックすればすぐにプログラムを実行できます．

バッチファイルの場合，javacLog.txtにコンパイル結果が出力されます．

実行すると
```java:run
java MainGame
---Player Profile---
LV:     1
HP:     100
MP:     50
ATK:    50
DEF:    50
SPEED:  5
LUK:    30
---Command List---
1: Add Lv
2: Sub Lv
3: Add atk
4: Sub atk
5: Add def
6: Sub def
7: Add HP
8: Sub HP
9: Add MP
exit: close program
Input Command!
```

と表示されます．

ここのコマンドを作成しましょう．
