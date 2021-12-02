package days;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;

public class Day2 {

    List<String> input = new ArrayList<>();

    public void setup() {
        File file = new File("input/" + getClass().getSimpleName().toLowerCase() + ".txt");
        try {
            input = Files.readAllLines(file.toPath());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public long solution() {
        long depth = 0;
        long horizontal = 0;

        for (String s : input) {
            long value = Long.parseLong(s.split(" ")[1]);
            if (s.startsWith("forward")) {
                horizontal += value;
            } else if (s.startsWith("up")) {
                depth -= value;
            } else {
                depth += value;
            }
        }
        return depth * horizontal;
    }
}-
