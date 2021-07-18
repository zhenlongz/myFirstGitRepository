package com.example.workjob;

import io.netty.util.internal.StringUtil;
import org.springframework.util.ObjectUtils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.nio.charset.StandardCharsets;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class CalculateWorkingHours {
    public static void main(String[] args) throws Exception {
        File file = new File("D://CalculateWorkingHours.txt");
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm");
        Date startWork = sdf.parse("07:00");
        Date endMorning = sdf.parse("08:30");
        System.out.println("请输入开始时间:");
        Scanner sc = new Scanner(System.in);
        String next = sc.next();
        Date enterTime = sdf.parse(next);
        if (startWork.before(enterTime) && endMorning.after(enterTime)) {
            FileOutputStream fos = new FileOutputStream(file);
            fos.write(next.getBytes(StandardCharsets.UTF_8));
            fos.close();
        }
        FileInputStream fis = new FileInputStream(file);
        byte[] buf = new byte[1024];
        int read = fis.read();
    }
}
