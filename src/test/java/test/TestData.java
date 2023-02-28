package test;

import java.util.Arrays;
import java.util.List;

public class TestData {

    static final List<Object[]> data = Arrays.asList(
            new Object[][]{ // {stn1, stn2, result}
                // du lieu dung ket qua
                {"0", "0", "0", true}, {"0", "21", "21", true},
                {"942", "0", "942", true}, {"021822", "298", "022120", true},
                {"82951", "92", "83043", true}, {"28", "284", "312", true},
                // du lieu phai cho ra ket qua loi
                {"1", "2", "8", false}, {"0", "0", "00", false},
                {"22", "21", "24", false}, {"25", "251", "20", false},
                {"298923", "82512", "0", false}, {"25", "27", "285715", false}
            }
    );
}
