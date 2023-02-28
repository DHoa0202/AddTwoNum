package com;

public class MyBigNumber {

    // giá trị chuỗi kết quả & "tham số 1" & "tham số 2"
    public static String sum(String stn1, String stn2) {
        // phần dư không có cho lần đầu tiên
        return add("", stn1, stn2, 0);
    }

    // Hàm đệ qui => cắt dần "stn1" và "stn2" => // thêm tổng và lượt trước vào "result"
    /**
     * Em sài đệ qui vì kết quả gọi đầu tiên sẽ được đẩy xuống cuối cùng phụ hợp
     * cho việc cắt bớt ký tự từ phải qua trái
     *
     * @param result: kết quả được cộng lại qua các lần đệ qui
     * @param stn1 : sau khi đệ qui sẽ giảm giần để lấy kí tự số cuối cùng
     * @param stn2 : giống như "stn1" cắt bớt cho đến khi không thể cắt tiếp
     * @param intRema : integer remainder cộng thêm vào đệ qui kế tiếp
     * @return
     */
    private static String add(String result, String stn1, String stn2, Integer intRema) {
        int at1 = stn1.length() - 1, at2 = stn2.length() - 1;
        int x = at1 > -1 ? Integer.parseInt(stn1.substring(at1)) : 0;
        int y = at2 > -1 ? Integer.parseInt(stn2.substring(at2)) : 0;
        int sum = x + y + intRema; // tổng hiện tại + phần nhớ của lượt trước

        if (at1 > 0 || at2 > 0) { // độ dài chuỗi > 0 là điều điện cắt tránh lỗi
            stn1 = at1 > -1 ? stn1.substring(0, at1) : "";
            stn2 = at2 > -1 ? stn2.substring(0, at2) : "";
            // truyển tiếp "stn1" & "stn2" ||| 1 là phần "intRema" cho lượt sau
            result += add(result, stn1, stn2, sum > 9 ? 1 : 0);
        } // phần này lấy sum-10 vì nó là phần của lượt trước
        return result + (sum > 9 ? sum - 10 : sum);
        /**
         * lượt trước lấy phần nguyên <> lượt sau lấy phần dư nhưng số lớn nhất
         * của một chữ số là 9 cộng lại cũng chỉ 18 nên phần (sum > 9 ? 1 : 0) 1
         * đại diện cho lượt sau có dư || 0 dư ra (sum > 9 ? sum - 10 : sum)
         * sum-10 lấy hiệu và đưa 1 vào "intRema"
         */
    }
}
