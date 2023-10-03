public class Guest {
        int id;
        String firstName;
        String lastName;
        String emailId;

        public Guest(int id, String firstName, String lastName, String emailId) {
            this.id = id;
            this.firstName = firstName;
            this.lastName = lastName;
            this.emailId = emailId;
        }

        @Override
        public String toString() {
            return "Guest{" +
                    "id=" + id +
                    ", firstName='" + firstName + '\'' +
                    ", lastName='" + lastName + '\'' +
                    ", emailId='" + emailId + '\'' +
                    '}';
        }
}
