public class Member {
    int memberId;
    String memberName;
    Member(int memberId, String memberName) {
        this.memberId = memberId;
        this.memberName = memberName;
    }
    void displayMember() {
        System.out.println(memberId + " - " + memberName);
    }
}