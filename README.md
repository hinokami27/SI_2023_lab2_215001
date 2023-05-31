# Драган Голабоски 215001

## Control flow graph
![cfg](https://github.com/hinokami27/SI_2023_lab2_215001/assets/106191814/2c0c17b1-9053-4c90-a609-4528330d6e8d)


## Цикломатска комплексност
Број на ребра = 37

Број на јазли = 28

ЦК = бр.ребра - бр.јазли + 2 =

37-28+2 = 11 

## Every Branch

![everybranch](https://github.com/hinokami27/SI_2023_lab2_215001/assets/106191814/09680b56-d1b1-40d6-9a41-81a47f5c0c82)


TC1 = user("name",password?,email@gmail.com),allUsers("exuser","expswrd!","email@yahoo.com") - nov user

TC2 = user==null - "Mandatory information missing!" exception

TC3 = user("name","pswrd","email@email.com"),allUsers("name","pswrd","email@email.com") - postoecki user so nevaliden password

TC4 = user(null,"pass word","emailgmail.com"),allUsers("name","pswrd","email@email.com") - setira username=email i nevaliden password poradi " "

## Multiple condition

(user==null || user.getPassword()==null || user.getEmail()==null)

1. T || X || X  user=null
2. F || T || T  user("name",null,null)
3. F || F || T  user("name","password?",null)
4. F || T || F  user("name",null,"email@gmail.com")
5. F || F || F  user("name","password?","email.gmail.com")

## Unit tests
За секој тест случај е направен тест кој има предвиден исход. На секој тест се предадени параметри со кои при извршување на програмата треба да се добие исходот кој го очекуваме.
