# AddTwoNum
Em là Duy Hòa viết dự án này làm dự án kiểm tra đầu vào cho vị trí thực tập sinh tại `Cổ Phần Công nghệ Tiên Phong ITDG.`
<hr/>

# Cài đặt project
```
git clone https://github.com/DHoa0202/AddTwoNum.git
```

<hr/>

# Chạy trực tiếp thông qua phương thức main

[main](./src/main/java/com/Add2Num.java) sử dụng logging kiểm tra kết quả của 2 tham số truyền vào<br/>
[core](./src/main/java/com/MyBigNumber.java) là lõi sử dụng cộng hai chuỗi với phương thức đệ qui

<hr/>

# UNIT TEST-CASE
`trước khi chạy project tải thư viện giúp em để tải thư viện (junit v4.13.1)`

[test](./src/test/java/test/TestAddTwoNums.java) để thực hiện chương trình test junit <br/>
[data](./src/test/java/test/TestData.java) là phần dữ liệu để test unit với 4 params sau

- stn1 : tham số thứ nhất kiểu String
- stn2 : tham số thứ hai kiểu String
- result: kết quả mong muốn của hai tham số sau khi thực hiện sum(stn1, stn2)
- isSuccess: để kiểm tra kết quả sum(stn1, stn2) == result hay không
