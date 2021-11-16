public class Homework6 {
    static class Course {
        String code;
        String name;

        public Course() {}
        public Course(String a, String b) {
            code = a;
            name = b;
        }

        String getCode() {
            return code;
        }
        String getName() {
            return name;
        }
    }

    static class OfflineCourse extends Course {
        public OfflineCourse() {}
        public OfflineCourse(String c, String d) {
            super(c, d);
        }
        @Override
        public String toString() {
            return "Code: "+ code + ", Name: " + name + ", Type: Offline";
        }
    }

    static class OnlineCourse extends Course {
        OnlineCourse(String e, String f) {
            super(e, f);
        }

        @Override
        public String toString() {
            return "Code: "+ code + ", Name: " + name + ", Type: Online";
        }
    }

    public static void main(String[] args) {
        OfflineCourse course1 = new OfflineCourse("HAEA9201", "Object Oriented Prodramming");
        OfflineCourse course2 = new OfflineCourse("HAFL0012", "C Programming 1");
        System.out.println(course1);
        System.out.println(course2);
    }
}
