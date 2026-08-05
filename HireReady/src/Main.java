
public class Main {

    public static void main(String args[]) {
//declaration of variables
 String candidate_name = "Suhani Kumari";
 int registration_number = 12345;
 String degree = "B.Tech CSE";
 int graduation_year = 2026;
 double degree_percentage = 83.5;
 int active_backlogs = 0;
 int aptitude_correct_answers = 90;
 int aptitude_total_questions = 100;
 int coding_test_cases_passed = 13;
 int coding_total_test_cases = 14;
 int communication_score = 80;
 boolean project_completed = true;
 boolean profile_verified = true;

double aptiPercentage = (double)aptitude_correct_answers / aptitude_total_questions * 100;
double codingPercentage = (double)coding_test_cases_passed / coding_total_test_cases * 100;

//eligibility
boolean degreeEligible = degree_percentage >=60;
boolean backlogsEligible = active_backlogs==0;
boolean graduationEligible = graduation_year >= 2025 && graduation_year <= 2027;
boolean aptitudeEligible = aptiPercentage >= 60;
boolean codingEligible = codingPercentage >= 70;
boolean communicationEligible = communication_score >= 60;
boolean projectEligible = project_completed;
boolean profileEligible = profile_verified;
boolean finalEligible = degreeEligible && backlogsEligible && graduationEligible && aptitudeEligible && codingEligible && communicationEligible && projectEligible && profileEligible;

// candidate profile
System.out.println("-----------------------Candidate Profile---------------------");
System.out.println("Name: " + candidate_name);
System.out.println("Registration Number: " + registration_number);
System.out.println("Degree: " + degree);
System.out.println("Graduation Year: " + graduation_year);
System.out.println("Degree Percentage: " + degree_percentage);
System.out.println("Active Backlogs: " + active_backlogs);
System.out.println("Aptitude Correct Answers: " + aptitude_correct_answers);
System.out.println("Aptitude Total Questions: " + aptitude_total_questions);
System.out.println("Coding Test Cases Passed: " + coding_test_cases_passed);
System.out.println("Coding Total Test Cases: " + coding_total_test_cases);
System.out.println("Communication Score: " + communication_score);
System.out.println("Project Completed: " + project_completed);
System.out.println("Profile Verified: " + profile_verified);

// Exam details
System.out.println("--------------------Exam details---------------------");
System.out.println("Aptitude Score: " + aptitude_correct_answers + "/" + aptitude_total_questions);
System.out.println("Aptitude Percentage: " + aptiPercentage);
System.out.println("Coding Score: " + coding_test_cases_passed + "/" + coding_total_test_cases);
System.out.println("Coding Percentage: " + codingPercentage);
System.out.println("Communication Score: " + communication_score);
System.out.println("Project Completed: " + project_completed);
System.out.println("Profile Verified: " + profile_verified);

//eligibility
System.out.println("Degree Eligible: " + (degreeEligible ? "Eligible" : "Not Eligible"));
System.out.println("Backlogs Eligible: " + (backlogsEligible ? "Eligible" : "Not Eligible"));
System.out.println("Graduation Eligible: " + (graduationEligible ? "Eligible" : "Not Eligible"));
System.out.println("Aptitude Eligible: " + (aptitudeEligible ? "Eligible" : "Not Eligible"));
System.out.println("Coding Eligible: " + (codingEligible ? "Eligible" : "Not Eligible"));
System.out.println("Communication Eligible: " + (communicationEligible ? "Eligible" : "Not Eligible"));
System.out.println("Project Eligible: " + (projectEligible ? "Yes" : "No"));
System.out.println("Profile Eligible: " + (profileEligible ? "Yes" : "No"));
System.out.println("Final Eligible: " + (finalEligible ? "Eligible" : "Not Eligible"));

// Status
System.out.println("---------------------Application Status---------------------");
String status;
String nextaction;
if(!degreeEligible){
    status="Not Eligible";
    nextaction="Improve the required degree percentage";
}
else if(!backlogsEligible){
    status="Not Eligible";
    nextaction="Clear all active backlogs";
}
else if(!graduationEligible){
    status="Not Eligible";
    nextaction="Check the eligible graduation-year criteria";
}
else if(!aptitudeEligible){
    status="Not Eligible";
    nextaction="Improve aptitude assessment performance";
}
else if(!codingEligible){
    status="Not Eligible";
    nextaction="Improve coding assessment performance";
}
else if(!communicationEligible){
    status="Not Eligible";
    nextaction="Improve communication assessment performance";
}
else if(!projectEligible){
    status="Application On Hold";
    nextaction="Complete the required project";
}
else if(!profileEligible){
    status="Application On Hold";
    nextaction="Complete profile verification";
}
else{
    status="Eligible to Apply";
    nextaction="Submit the company application";
}

System.out.println("Status: " + status);
System.out.println("Next Action: " + nextaction);


    }
};
