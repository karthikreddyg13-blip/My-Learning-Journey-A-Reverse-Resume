import java.io.*;
import java.time.LocalDate;
import java.util.*;
import java.util.stream.*;

public class ReverseResumeGenerator {
    // Main entry point for the application
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Print banner and welcome message
        DisplayEngine.printBanner();
        System.out.println("Today: " + LocalDate.now() + "   |   Welcome, Future Professional!");
        // Load database
        Map<String, Roadmap> database = RoadmapDatabase.loadData();
        // Start menu handler
        MenuHandler.start(scanner, database);
        // Goodbye message
        System.out.println("\nThank you for using Reverse Resume Generator. Goodbye!");
        scanner.close();
    }

    // Skill model class
    static class Skill {
        private String name;
        private String category;
        private int proficiency;
        private String level;

        // Constructor for Skill
        public Skill(String name, String category, int proficiency, String level) {
            this.name = name;
            this.category = category;
            this.proficiency = proficiency;
            this.level = level;
        }

        // Getters
        public String getName() { return name; }
        public String getCategory() { return category; }
        public int getProficiency() { return proficiency; }
        public String getLevel() { return level; }
    }

    // Course model class
    static class Course {
        private String name;
        private String platform;
        private String duration;
        private boolean isFree;
        private String url;

        public Course(String name, String platform, String duration, boolean isFree, String url) {
            this.name = name;
            this.platform = platform;
            this.duration = duration;
            this.isFree = isFree;
            this.url = url;
        }

        public String getName() { return name; }
        public String getPlatform() { return platform; }
        public String getDuration() { return duration; }
        public boolean isFree() { return isFree; }
        public String getUrl() { return url; }
    }

    // Project model class
    static class Project {
        private String name;
        private String description;
        private List<String> techStack;
        private String difficulty;
        private int estimatedDays;

        public Project(String name, String description, List<String> techStack, String difficulty, int estimatedDays) {
            this.name = name;
            this.description = description;
            this.techStack = techStack;
            this.difficulty = difficulty;
            this.estimatedDays = estimatedDays;
        }

        public String getName() { return name; }
        public String getDescription() { return description; }
        public List<String> getTechStack() { return techStack; }
        public String getDifficulty() { return difficulty; }
        public int getEstimatedDays() { return estimatedDays; }
    }

    // Milestone model class
    static class Milestone {
        private String period;
        private String title;
        private String description;
        private List<String> goals;

        public Milestone(String period, String title, String description, List<String> goals) {
            this.period = period;
            this.title = title;
            this.description = description;
            this.goals = goals;
        }

        public String getPeriod() { return period; }
        public String getTitle() { return title; }
        public String getDescription() { return description; }
        public List<String> getGoals() { return goals; }
    }

    // Roadmap model class
    static class Roadmap {
        private String jobTitle;
        private String totalTimeline;
        private String salaryRange;
        private String demandLevel;
        private List<Skill> skills;
        private List<Course> courses;
        private List<Project> projects;
        private List<Milestone> milestones;

        public Roadmap(String jobTitle,
                       String totalTimeline,
                       String salaryRange,
                       String demandLevel,
                       List<Skill> skills,
                       List<Course> courses,
                       List<Project> projects,
                       List<Milestone> milestones) {
            this.jobTitle = jobTitle;
            this.totalTimeline = totalTimeline;
            this.salaryRange = salaryRange;
            this.demandLevel = demandLevel;
            this.skills = skills;
            this.courses = courses;
            this.projects = projects;
            this.milestones = milestones;
        }

        public String getJobTitle() { return jobTitle; }
        public String getTotalTimeline() { return totalTimeline; }
        public String getSalaryRange() { return salaryRange; }
        public String getDemandLevel() { return demandLevel; }
        public List<Skill> getSkills() { return skills; }
        public List<Course> getCourses() { return courses; }
        public List<Project> getProjects() { return projects; }
        public List<Milestone> getMilestones() { return milestones; }
    }

    // Database loader class
    static class RoadmapDatabase {
        // Load hardcoded data for known roles
        public static Map<String, Roadmap> loadData() {
            Map<String, Roadmap> map = new HashMap<>();

            // AI Engineer
            map.put("ai engineer", createAIEngineerRoadmap());
            map.put("full stack developer", createFullStackRoadmap());
            map.put("frontend developer", createFrontEndRoadmap());
            map.put("backend developer", createBackEndRoadmap());
            map.put("data scientist", createDataScientistRoadmap());
            map.put("ui ux designer", createUIUXRoadmap());
            map.put("devops engineer", createDevOpsRoadmap());
            map.put("cybersecurity analyst", createCyberSecRoadmap());

            return map;
        }

        // Create each roadmap with rich detail
        private static Roadmap createAIEngineerRoadmap() {
            List<Skill> skills = Arrays.asList(
                new Skill("Python", "Programming", 90, "Advanced"),
                new Skill("Machine Learning", "AI/ML", 85, "Advanced"),
                new Skill("TensorFlow", "AI/ML", 80, "Intermediate"),
                new Skill("Deep Learning", "AI/ML", 78, "Advanced"),
                new Skill("SQL", "Tools", 70, "Intermediate"),
                new Skill("Statistics", "Math", 75, "Intermediate"),
                new Skill("Git", "Tools", 65, "Beginner"),
                new Skill("Docker", "Tools", 60, "Beginner")
            );
            List<Course> courses = Arrays.asList(
                new Course("Machine Learning by Andrew Ng", "Coursera", "11 weeks", false, "coursera.org/ml"),
                new Course("Deep Learning Specialization", "Coursera", "16 weeks", false, "coursera.org/dl"),
                new Course("fast.ai", "fast.ai", "8 weeks", true, "fast.ai"),
                new Course("Python for Everybody", "Coursera", "8 weeks", true, "coursera.org/python"),
                new Course("Kaggle ML Courses", "Kaggle", "4 weeks", true, "kaggle.com/learn/overview")
            );
            List<Project> projects = Arrays.asList(
                new Project("Sentiment Analyzer", "Analyze sentiment of text using NLP.", Arrays.asList("Python","NLTK","Flask"), "Beginner", 7),
                new Project("Image Classifier", "Build CNN for image recognition.", Arrays.asList("Python","TensorFlow","CNN"), "Intermediate", 14),
                new Project("Chatbot with NLP", "Create conversational agent.", Arrays.asList("Python","transformers","FastAPI"), "Intermediate", 21),
                new Project("Stock Price Predictor", "Predict stock price with LSTM.", Arrays.asList("Python","LSTM","Pandas"), "Advanced", 30),
                new Project("AI Resume Screener", "Automate resume screening.", Arrays.asList("Python","ML","React"), "Advanced", 45)
            );
            List<Milestone> milestones = Arrays.asList(
                new Milestone("Month 1-2", "Python Basics", "Learn syntax and basics.", Arrays.asList("Variables & types","Control flow","Functions","Mini projects")),
                new Milestone("Month 3-4", "Math & Statistics", "Study linear algebra and statistics.", Arrays.asList("Linear algebra","Probability","Statistics fundamentals","Practice problems")),
                new Milestone("Month 5-6", "ML Fundamentals", "Understand basic algorithms.", Arrays.asList("Regression","Classification","Clustering","ML libraries")),
                new Milestone("Month 7-9", "Deep Learning", "Dive into neural nets.", Arrays.asList("Neural networks","CNNs","RNNs","Frameworks")),
                new Milestone("Month 10-12", "Projects & Portfolio", "Build and share projects.", Arrays.asList("Complete projects","GitHub portfolio","Blog posts","Networking")),
                new Milestone("Month 13-18", "Job Applications", "Apply for positions.", Arrays.asList("Resume prep","Mock interviews","Job boards","Referrals"))
            );
            return new Roadmap("AI Engineer","12-18 months","$100,000 - $160,000/year","Very High",skills,courses,projects,milestones);
        }

        private static Roadmap createFullStackRoadmap() {
            List<Skill> skills = Arrays.asList(
                new Skill("HTML/CSS", "Frontend", 85, "Intermediate"),
                new Skill("JavaScript", "Programming", 88, "Advanced"),
                new Skill("React", "Frontend", 82, "Advanced"),
                new Skill("Node.js", "Backend", 78, "Intermediate"),
                new Skill("SQL", "Database", 72, "Intermediate"),
                new Skill("MongoDB", "Database", 68, "Intermediate"),
                new Skill("Git", "Tools", 80, "Intermediate"),
                new Skill("REST APIs", "Backend", 75, "Intermediate")
            );
            List<Course> courses = Arrays.asList(
                new Course("The Web Developer Bootcamp", "Udemy", "65 hours", false, "udemy.com/webdeveloper"),
                new Course("JavaScript: The Complete Guide", "Udemy", "52 hours", false, "udemy.com/js"),
                new Course("React - The Complete Guide", "Udemy", "48 hours", false, "udemy.com/react"),
                new Course("Node.js Crash Course", "YouTube", "", true, "youtube.com/nodejs"),
                new Course("MongoDB University", "MongoDB", "", true, "university.mongodb.com")
            );
            List<Project> projects = Arrays.asList(
                new Project("Portfolio Website", "Build a personal portfolio.", Arrays.asList("HTML","CSS","JavaScript"), "Beginner", 5),
                new Project("Todo App with React", "Create todo application.", Arrays.asList("React","JavaScript"), "Beginner", 7),
                new Project("REST API with Node/Express", "Backend API.", Arrays.asList("Node.js","Express","JavaScript"), "Intermediate", 10),
                new Project("E-commerce Site", "Full e-commerce platform.", Arrays.asList("React","Node.js","MongoDB"), "Advanced", 30),
                new Project("Social Media Clone", "Clone Instagram or Twitter.", Arrays.asList("React","Node.js","MongoDB"), "Advanced", 40)
            );
            List<Milestone> milestones = Arrays.asList(
                new Milestone("Month 1-2", "HTML/CSS/JS", "Get comfortable with basics.", Arrays.asList("HTML structure","CSS styling","JavaScript basics","Mini projects")),
                new Milestone("Month 3-4", "React Frontend", "Build dynamic UIs.", Arrays.asList("Components","State","Props","Hooks")),
                new Milestone("Month 5-6", "Backend/Node", "Create server-side code.", Arrays.asList("Node basics","Express","APIs","Authentication")),
                new Milestone("Month 7-9", "Database & Deployment", "Persist data and deploy.", Arrays.asList("SQL/Mongo","Hosting","CI/CD","Testing")),
                new Milestone("Month 10-14", "Full Projects", "Build complete apps.", Arrays.asList("Project planning","Teamwork","Code reviews","Launch"))
            );
            return new Roadmap("Full Stack Developer","10-14 months","$85,000 - $140,000/year","Very High",skills,courses,projects,milestones);
        }

        private static Roadmap createFrontEndRoadmap() {
            List<Skill> skills = Arrays.asList(
                new Skill("HTML/CSS", "Frontend", 90, "Advanced"),
                new Skill("JavaScript", "Programming", 85, "Advanced"),
                new Skill("React", "Frontend", 80, "Intermediate"),
                new Skill("CSS Frameworks", "Frontend", 75, "Intermediate"),
                new Skill("Responsive Design", "Frontend", 78, "Intermediate"),
                new Skill("Git", "Tools", 70, "Beginner"),
                new Skill("Accessibility", "Frontend", 65, "Beginner"),
                new Skill("Web Performance", "Frontend", 68, "Beginner")
            );
            List<Course> courses = Arrays.asList(
                new Course("Modern HTML & CSS", "Udemy", "14 hours", false, "udemy.com/htmlcss"),
                new Course("JavaScript Essentials", "Udemy", "20 hours", false, "udemy.com/jsessentials"),
                new Course("React for Beginners", "YouTube", "", true, "youtube.com/reactbeginners"),
                new Course("CSS Grid & Flexbox", "freeCodeCamp", "", true, "freecodecamp.org"),
                new Course("Web Accessibility", "Coursera", "4 weeks", false, "coursera.org/accessibility")
            );
            List<Project> projects = Arrays.asList(
                new Project("Landing Page", "Design a landing page.", Arrays.asList("HTML","CSS"), "Beginner", 3),
                new Project("React Dashboard", "Admin dashboard UI.", Arrays.asList("React","CSS"), "Intermediate", 10),
                new Project("Animated Website", "Use CSS animations.", Arrays.asList("HTML","CSS","JavaScript"), "Intermediate", 7),
                new Project("Portfolio with CMS", "Static site with headless CMS.", Arrays.asList("React","GraphQL"), "Advanced", 20),
                new Project("Accessibility Audit Tool", "Tool for checking sites.", Arrays.asList("JavaScript","HTML"), "Advanced", 25)
            );
            List<Milestone> milestones = Arrays.asList(
                new Milestone("Month 1-2", "HTML/CSS Mastery", "Deep dive into markup and styles.", Arrays.asList("HTML5","CSS3","Selectors","Layouts")),
                new Milestone("Month 3-4", "JavaScript Core", "Learn JS fundamentals.", Arrays.asList("DOM","ES6","Async","Fetch")),
                new Milestone("Month 5-6", "React Basics", "Start with React.", Arrays.asList("Components","JSX","State","Props")),
                new Milestone("Month 7-9", "Advanced Frontend", "Performance and accessibility.", Arrays.asList("Optimizations","PWAs","Accessibility","Testing"))
            );
            return new Roadmap("Frontend Developer","8-12 months","$70,000 - $120,000/year","High",skills,courses,projects,milestones);
        }

        private static Roadmap createBackEndRoadmap() {
            List<Skill> skills = Arrays.asList(
                new Skill("Java", "Programming", 85, "Advanced"),
                new Skill("Spring Boot", "Framework", 80, "Intermediate"),
                new Skill("SQL", "Database", 82, "Advanced"),
                new Skill("REST APIs", "Backend", 78, "Intermediate"),
                new Skill("Microservices", "Architecture", 70, "Beginner"),
                new Skill("Docker", "Tools", 65, "Beginner"),
                new Skill("Git", "Tools", 75, "Intermediate"),
                new Skill("CI/CD", "Tools", 68, "Beginner")
            );
            List<Course> courses = Arrays.asList(
                new Course("Java Programming Masterclass", "Udemy", "80 hours", false, "udemy.com/java"),
                new Course("Spring Framework", "Coursera", "12 weeks", false, "coursera.org/spring"),
                new Course("SQL Bootcamp", "Udemy", "20 hours", false, "udemy.com/sql"),
                new Course("Docker Essentials", "YouTube", "", true, "youtube.com/docker"),
                new Course("Microservices with Spring", "Udemy", "", false, "udemy.com/microservices")
            );
            List<Project> projects = Arrays.asList(
                new Project("REST API", "Build RESTful services.", Arrays.asList("Java","Spring Boot"), "Intermediate", 14),
                new Project("Authentication System", "JWT auth.", Arrays.asList("Java","Spring Security"), "Intermediate", 10),
                new Project("E-commerce Backend", "Order processing.", Arrays.asList("Java","Spring","SQL"), "Advanced", 30),
                new Project("Microservice Cluster", "Deploy multiple services.", Arrays.asList("Docker","Kubernetes"), "Advanced", 45),
                new Project("Logging & Monitoring", "Add observability.", Arrays.asList("ELK","Prometheus"), "Advanced", 20)
            );
            List<Milestone> milestones = Arrays.asList(
                new Milestone("Month 1-2", "Java Basics", "Core Java fundamentals.", Arrays.asList("Syntax","OOP","Collections","Streams")),
                new Milestone("Month 3-4", "Spring Boot", "Build web apps.", Arrays.asList("Controllers","Services","Repositories","Beans")),
                new Milestone("Month 5-6", "Databases & APIs", "Persist data and expose APIs.", Arrays.asList("SQL","JPA","REST","Postman")),
                new Milestone("Month 7-9", "Advanced Backend", "Scaling & deployment.", Arrays.asList("Docker","CI/CD","Microservices","Security"))
            );
            return new Roadmap("Backend Developer","9-13 months","$80,000 - $130,000/year","High",skills,courses,projects,milestones);
        }

        private static Roadmap createDataScientistRoadmap() {
            List<Skill> skills = Arrays.asList(
                new Skill("Python", "Programming", 88, "Advanced"),
                new Skill("Statistics", "Math", 85, "Advanced"),
                new Skill("Pandas", "Tools", 80, "Intermediate"),
                new Skill("Machine Learning", "AI/ML", 82, "Intermediate"),
                new Skill("Data Visualization", "Tools", 78, "Intermediate"),
                new Skill("SQL", "Database", 70, "Intermediate"),
                new Skill("Git", "Tools", 65, "Beginner"),
                new Skill("Big Data", "Tools", 60, "Beginner" )
            );
            List<Course> courses = Arrays.asList(
                new Course("Data Science Specialization", "Coursera", "10 months", false, "coursera.org/datascience"),
                new Course("Applied Data Science with Python", "Coursera", "5 months", false, "coursera.org/applydatasci"),
                new Course("Python for Data Science", "Udemy", "25 hours", false, "udemy.com/pydatasci"),
                new Course("Statistics for Data Science", "YouTube", "", true, "youtube.com/statsdatasci"),
                new Course("Intro to Big Data", "Udacity", "", false, "udacity.com/bigdata")
            );
            List<Project> projects = Arrays.asList(
                new Project("Data Cleaning Pipeline", "Clean messy datasets.", Arrays.asList("Python","Pandas"), "Beginner", 10),
                new Project("Exploratory Analysis", "Analyze dataset.", Arrays.asList("Python","Matplotlib"), "Beginner", 7),
                new Project("ML Model", "Train predictive model.", Arrays.asList("Python","scikit-learn"), "Intermediate", 14),
                new Project("Dashboard", "Visualize data.", Arrays.asList("Tableau","Python"), "Intermediate", 20),
                new Project("Big Data Processing", "Use Hadoop/Spark.", Arrays.asList("Spark","Scala"), "Advanced", 30)
            );
            List<Milestone> milestones = Arrays.asList(
                new Milestone("Month 1-2", "Python & Stats", "Basics of programming & math.", Arrays.asList("Python syntax","Probability","Distributions","Statistics")),
                new Milestone("Month 3-4", "Data Wrangling", "Handling datasets.", Arrays.asList("Pandas","Cleaning","Merging","EDA")),
                new Milestone("Month 5-6", "Machine Learning", "Build models.", Arrays.asList("Regression","Classification","Clustering","Model eval")),
                new Milestone("Month 7-9", "Big Data & Projects", "Scale and share.", Arrays.asList("Spark","Deployment","Portfolio","Job applications"))
            );
            return new Roadmap("Data Scientist","11-15 months","$90,000 - $150,000/year","Very High",skills,courses,projects,milestones);
        }

        private static Roadmap createUIUXRoadmap() {
            List<Skill> skills = Arrays.asList(
                new Skill("Sketch/Figma", "Design Tools", 80, "Intermediate"),
                new Skill("User Research", "UX", 75, "Intermediate"),
                new Skill("Prototyping", "UX", 70, "Intermediate"),
                new Skill("Visual Design", "UI", 78, "Intermediate"),
                new Skill("Interaction Design", "UI", 72, "Intermediate"),
                new Skill("HTML/CSS", "Frontend", 65, "Beginner"),
                new Skill("Wireframing", "UX", 68, "Beginner"),
                new Skill("Usability Testing", "UX", 60, "Beginner")
            );
            List<Course> courses = Arrays.asList(
                new Course("UI/UX Design Bootcamp", "Udemy", "30 hours", false, "udemy.com/uiux"),
                new Course("Human-Centered Design", "Coursera", "4 weeks", false, "coursera.org/hcd"),
                new Course("Figma for Beginners", "YouTube", "", true, "youtube.com/figmabeg"),
                new Course("Interaction Design", "UCSD", "", false, "coursera.org/interaction"),
                new Course("UX Research", "LinkedIn Learning", "", false, "linkedin.com/uxresearch")
            );
            List<Project> projects = Arrays.asList(
                new Project("Portfolio Redesign", "Design own portfolio.", Arrays.asList("Figma","HTML"), "Beginner", 10),
                new Project("App Prototype", "Build mobile prototype.", Arrays.asList("Figma","Sketch"), "Intermediate", 15),
                new Project("User Testing Report", "Conduct usability study.", Arrays.asList("Research","Analysis"), "Intermediate", 12),
                new Project("Website Redesign", "Redesign existing site.", Arrays.asList("HTML","CSS","Figma"), "Advanced", 25),
                new Project("Design System", "Create reusable UI kit.", Arrays.asList("Figma","Sketch"), "Advanced", 20)
            );
            List<Milestone> milestones = Arrays.asList(
                new Milestone("Month 1-2", "Design Basics", "Learn principles.", Arrays.asList("Color theory","Typography","Layout","Basic tools")),
                new Milestone("Month 3-4", "Wireframing & Prototyping", "Sketch flows.", Arrays.asList("Wireframes","Prototypes","Feedback","Iteration")),
                new Milestone("Month 5-6", "User Research", "Understand users.", Arrays.asList("Interviews","Surveys","Personas","Analysis")),
                new Milestone("Month 7-9", "Advanced Projects", "Build showcase.", Arrays.asList("Complex prototypes","Design system","Portfolio","Networking"))
            );
            return new Roadmap("UI UX Designer","9-12 months","$70,000 - $110,000/year","High",skills,courses,projects,milestones);
        }

        private static Roadmap createDevOpsRoadmap() {
            List<Skill> skills = Arrays.asList(
                new Skill("Linux", "OS", 80, "Intermediate"),
                new Skill("Docker", "Tools", 75, "Intermediate"),
                new Skill("Kubernetes", "Tools", 70, "Intermediate"),
                new Skill("CI/CD", "Tools", 78, "Intermediate"),
                new Skill("Cloud Platforms", "Cloud", 72, "Intermediate"),
                new Skill("Networking", "Infrastructure", 68, "Beginner"),
                new Skill("Scripting", "Programming", 65, "Beginner"),
                new Skill("Monitoring", "Tools", 60, "Beginner")
            );
            List<Course> courses = Arrays.asList(
                new Course("Docker for DevOps", "Udemy", "20 hours", false, "udemy.com/dockerdevops"),
                new Course("Kubernetes Hands-On", "Coursera", "4 weeks", false, "coursera.org/k8s"),
                new Course("Linux Basics", "YouTube", "", true, "youtube.com/linuxbasics"),
                new Course("CI/CD with Jenkins", "Udemy", "", false, "udemy.com/jenkins"),
                new Course("AWS DevOps", "AWS", "", false, "aws.amazon.com/devops" )
            );
            List<Project> projects = Arrays.asList(
                new Project("Containerize App", "Dockerize existing app.", Arrays.asList("Docker","Linux"), "Beginner", 7),
                new Project("CI Pipeline", "Set up Jenkins pipeline.", Arrays.asList("Jenkins","Git"), "Intermediate", 14),
                new Project("K8s Cluster", "Deploy on Kubernetes.", Arrays.asList("Kubernetes","Docker"), "Intermediate", 21),
                new Project("Monitoring Stack", "Implement Prometheus.", Arrays.asList("Prometheus","Grafana"), "Advanced", 20),
                new Project("Cloud Deployment", "Deploy to AWS.", Arrays.asList("AWS","Terraform"), "Advanced", 30)
            );
            List<Milestone> milestones = Arrays.asList(
                new Milestone("Month 1-2", "Linux & Scripting", "Get comfortable with Linux.", Arrays.asList("Shell commands","Bash scripting","Permissions","Basic networking")),
                new Milestone("Month 3-4", "Containers", "Learn Docker.", Arrays.asList("Dockerfiles","Images","Volumes","Networking")),
                new Milestone("Month 5-6", "Orchestration", "Kubernetes basics.", Arrays.asList("Pods","Services","Deployments","ConfigMaps")),
                new Milestone("Month 7-9", "CI/CD & Cloud", "Automate and deploy.", Arrays.asList("Jenkins","AWS","Terraform","Monitoring"))
            );
            return new Roadmap("DevOps Engineer","10-14 months","$90,000 - $150,000/year","Very High",skills,courses,projects,milestones);
        }

        private static Roadmap createCyberSecRoadmap() {
            List<Skill> skills = Arrays.asList(
                new Skill("Networking", "Infrastructure", 80, "Intermediate"),
                new Skill("Linux", "OS", 75, "Intermediate"),
                new Skill("Penetration Testing", "Security", 70, "Intermediate"),
                new Skill("Cryptography", "Math", 68, "Beginner"),
                new Skill("Cloud Security", "Cloud", 65, "Beginner"),
                new Skill("SIEM", "Tools", 60, "Beginner"),
                new Skill("Incident Response", "Security", 62, "Beginner"),
                new Skill("Firewalls", "Security", 70, "Intermediate")
            );
            List<Course> courses = Arrays.asList(
                new Course("Cybersecurity Fundamentals", "Coursera", "8 weeks", false, "coursera.org/cyberfund"),
                new Course("Network Security", "Udemy", "20 hours", false, "udemy.com/netsec"),
                new Course("Linux for Hackers", "YouTube", "", true, "youtube.com/linuxhack"),
                new Course("Penetration Testing", "Udemy", "", false, "udemy.com/pen"),
                new Course("Cloud Security", "AWS", "", false, "aws.amazon.com/security" )
            );
            List<Project> projects = Arrays.asList(
                new Project("Vulnerable VM", "Set up and hack a VM.", Arrays.asList("Linux","Networking"), "Beginner", 14),
                new Project("Password Cracker", "Build a brute-force tool.", Arrays.asList("Python","Cryptography"), "Intermediate", 10),
                new Project("Web App Pentest", "Test a web app.", Arrays.asList("Burp Suite","SQLi"), "Intermediate", 21),
                new Project("SIEM Deployment", "Install and configure.", Arrays.asList("Splunk","ELK"), "Advanced", 30),
                new Project("Incident Response Plan", "Document plan.", Arrays.asList("Procedure","Tools"), "Advanced", 20)
            );
            List<Milestone> milestones = Arrays.asList(
                new Milestone("Month 1-2", "Networking Basics", "Understand TCP/IP.", Arrays.asList("OSI model","Subnetting","Routing","Protocols")),
                new Milestone("Month 3-4", "Linux & Tools", "Learn Linux security tools.", Arrays.asList("nmap","Wireshark","iptables","ssh")),
                new Milestone("Month 5-6", "Pentesting", "Practice hacking.", Arrays.asList("Vulnerabilities","Exploits","Reporting","Ethics")),
                new Milestone("Month 7-9", "Advanced Defense", "Incident response.", Arrays.asList("SIEM","Forensics","Cloud sec","Cert prep"))
            );
            return new Roadmap("Cybersecurity Analyst","11-15 months","$85,000 - $140,000/year","Very High",skills,courses,projects,milestones);
        }

        // Generic roadmap for unknown job titles
        public static Roadmap getGenericRoadmap(String jobTitle) {
            List<Skill> skills = Arrays.asList(
                new Skill("Communication", "Soft Skill", 50, "Beginner"),
                new Skill("Time Management", "Soft Skill", 50, "Beginner"),
                new Skill("Research", "Soft Skill", 50, "Beginner"),
                new Skill("Teamwork", "Soft Skill", 50, "Beginner"),
                new Skill("Problem Solving", "Soft Skill", 50, "Beginner")
            );
            List<Course> courses = Arrays.asList(
                new Course("Learning How to Learn", "Coursera", "4 weeks", true, "coursera.org/learn/learnhowtolearn"),
                new Course("Introduction to Soft Skills", "Udemy", "10 hours", false, "udemy.com/softskills"),
                new Course("Career Development", "YouTube", "", true, "youtube.com/careerdevelop")
            );
            List<Project> projects = Arrays.asList(
                new Project("Personal Blog", "Set up a blog.", Arrays.asList("Writing","HTML"), "Beginner", 7),
                new Project("Volunteer Work", "Contribute time.", Arrays.asList("Community","Planning"), "Beginner", 14),
                new Project("Skill Showcase", "Build a showcase.", Arrays.asList("Portfolio","Presentation"), "Beginner", 10)
            );
            List<Milestone> milestones = Arrays.asList(
                new Milestone("Month 1-2", "Self Assessment", "Understand interests.", Arrays.asList("Personality tests","Strengths","Weaknesses","Goal setting")),
                new Milestone("Month 3-4", "Skill Building", "Learn core skills.", Arrays.asList("Take courses","Practice","Read books","Network")),
                new Milestone("Month 5-6", "Practical Experience", "Gain experience.", Arrays.asList("Projects","Internships","Volunteering","Feedback")),
                new Milestone("Month 7-8", "Application Prep", "Get ready to apply.", Arrays.asList("Resume","Interviews","References","Job search"))
            );
            Roadmap r = new Roadmap("Custom: " + jobTitle, "Varies","Varies","Medium",skills,courses,projects,milestones);
            return r;
        }
    }

    // Display engine for printing UI elements
    static class DisplayEngine {
        // Print ASCII banner
        public static void printBanner() {
            System.out.println("╔══════════════════════════════════════════════════════════════╗");
            System.out.println("║   ____  _______     _______ ____  ____  _____                ║");
            System.out.println("║  |  _ |    / / |  _ / || |               ║");
            System.out.println("║  | |) |  |   / /|  | | |) _ |  |                ║");
            System.out.println("║  |  _ <| |   V / | ||  _ < ) | |                ║");
            System.out.println("║  || __|  _/  |__|| __/|_____|               ║");
            System.out.println("║                                                               ║");
            System.out.println("║         REVERSE RESUME GENERATOR  v1.0                       ║");
            System.out.println("║         Enter Your Dream Job. Get Your Roadmap.              ║");
            System.out.println("╚══════════════════════════════════════════════════════════════╝");
        }
        // Divider line
        public static void printDivider() {
            System.out.println("──────────────────────────────────────────────────────────────");
        }
        // Section header
        public static void printSectionHeader(String title) {
            System.out.println("╔════════════════ " + title + " ════════════════╗");
        }
        // Summary card
        public static void printRoadmapSummary(Roadmap r) {
            System.out.println("★━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━★");
            System.out.println(r.getJobTitle().toUpperCase() + " ROADMAP");
            System.out.println("★━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━★");
            System.out.println("Salary Range  : " + r.getSalaryRange());
            String demand = r.getDemandLevel().toUpperCase();
            System.out.println("Demand Level  : [" + demand + " DEMAND]");
            System.out.println("Timeline      : " + r.getTotalTimeline());
            System.out.println("Skills        : " + r.getSkills().size() + " skills to learn");
            System.out.println("Courses       : " + r.getCourses().size() + " recommended courses");
            System.out.println("Projects      : " + r.getProjects().size() + " projects to build");
            printDivider();
        }
        // Print skills list
        public static void printSkills(List<Skill> skills) {
            printSectionHeader("SKILLS");
            for (Skill s : skills) {
                String name = s.getName();
                String cat = s.getCategory();
                int prof = s.getProficiency();
                String level = s.getLevel();
                // progress bar 50 chars
                int filled = prof * 50 / 100;
                int empty = 50 - filled;
                StringBuilder bar = new StringBuilder();
                for (int i = 0; i < filled; i++) bar.append('█');
                for (int i = 0; i < empty; i++) bar.append('░');
                System.out.printf("% -15s [%s] %d%% | %s\n", name, bar.toString(), prof, level);
            }
            printDivider();
        }
        // Print courses
        public static void printCourses(List<Course> courses) {
            printSectionHeader("COURSES");
            int idx = 1;
            for (Course c : courses) {
                System.out.println(idx + ") " + c.getName() + " (" + c.getPlatform() + ")");
                System.out.println("   Duration: " + c.getDuration() + " | " + (c.isFree() ? "FREE" : "PAID"));
                System.out.println("   URL: " + c.getUrl());
                idx++;
            }
            printDivider();
        }
        // Print projects
        public static void printProjects(List<Project> projects) {
            printSectionHeader("PROJECTS");
            int idx = 1;
            for (Project p : projects) {
                String badge = "[" + p.getDifficulty().toUpperCase() + "]";
                System.out.println(idx + ") " + p.getName() + " " + badge);
                System.out.println("   " + p.getDescription());
                System.out.println("   Tech Stack: " + String.join(" | ", p.getTechStack()));
                System.out.println("   Estimated time: " + p.getEstimatedDays() + " days");
                idx++;
            }
            printDivider();
        }
        // Print timeline
        public static void printTimeline(List<Milestone> milestones) {
            printSectionHeader("TIMELINE");
            for (Milestone m : milestones) {
                System.out.println("◉ " + m.getPeriod() + " ── " + m.getTitle().toUpperCase());
                for (String g : m.getGoals()) {
                    System.out.println("│   └─ " + g);
                }
                System.out.println("│");
            }
            printDivider();
        }
        // Loading animation
        public static void printLoadingAnimation(String message) {
            try {
                System.out.print(message);
                for (int i = 0; i < 3; i++) {
                    Thread.sleep(400);
                    System.out.print(".");
                }
                System.out.println(" Done!");
            } catch (InterruptedException e) {
                System.out.println();
            }
        }
        // Generic progress bar
        public static void printProgressBar(int current, int total, String label) {
            int width = 30;
            int filled = current * width / total;
            StringBuilder bar = new StringBuilder();
            for (int i = 0; i < filled; i++) bar.append('█');
            for (int i = filled; i < width; i++) bar.append('░');
            System.out.printf("%s [%s] %d/%d\n", label, bar.toString(), current, total);
        }
    }

    // Menu handling and user interaction
    static class MenuHandler {
        private static List<String> history = new ArrayList<>();
        private static Roadmap currentRoadmap = null;

        // Start the main menu loop
        public static void start(Scanner scanner, Map<String, Roadmap> db) {
            boolean exit = false;
            while (!exit) {
                printMainMenu();
                int choice = readInt(scanner, "Enter choice: ", 0, 7);
                switch (choice) {
                    case 1:
                        generateRoadmap(scanner, db);
                        break;
                    case 2:
                        browseJobs(scanner, db);
                        break;
                    case 3:
                        compareJobs(scanner, db);
                        break;
                    case 4:
                        searchSkills(scanner, db);
                        break;
                    case 5:
                        viewHistory();
                        break;
                    case 6:
                        saveCurrentRoadmapToFile();
                        break;
                    case 7:
                        about();
                        break;
                    case 0:
                        exit = true;
                        break;
                }
            }
        }

        // Print main menu text
        private static void printMainMenu() {
            System.out.println("════════════════════════════════════");
            System.out.println("MAIN MENU");
            System.out.println("════════════════════════════════════");
            System.out.println("[1] Generate Career Roadmap");
            System.out.println("[2] Browse All Available Jobs");
            System.out.println("[3] Compare Two Job Roles");
            System.out.println("[4] Search Skills for a Job");
            System.out.println("[5] View Roadmap History");
            System.out.println("[6] Save Roadmap to File");
            System.out.println("[7] About This Application");
            System.out.println("[0] Exit");
        }

        // Read integer with validation
        private static int readInt(Scanner scanner, String prompt, int min, int max) {
            int val;
            while (true) {
                System.out.print(prompt);
                try {
                    val = Integer.parseInt(scanner.nextLine().trim());
                    if (val < min || val > max) throw new NumberFormatException();
                    return val;
                } catch (NumberFormatException ex) {
                    System.out.println("Invalid input. Please enter a number between " + min + " and " + max + ".");
                }
            }
        }

        // Prompt for string with trimming
        private static String readString(Scanner scanner, String prompt) {
            System.out.print(prompt);
            return scanner.nextLine().trim();
        }

        // Generate roadmap option
        private static void generateRoadmap(Scanner scanner, Map<String, Roadmap> db) {
            String title = readString(scanner, "Enter your dream job title: ");
            DisplayEngine.printLoadingAnimation("Analyzing career path");
            String key = title.toLowerCase().trim();
            Roadmap r = db.get(key);
            if (r == null) {
                System.out.println("Job not found. Showing generic roadmap...");
                r = RoadmapDatabase.getGenericRoadmap(title);
            }
            currentRoadmap = r;
            addToHistory(title);
            DisplayEngine.printLoadingAnimation("Building your roadmap");
            DisplayEngine.printRoadmapSummary(r);
            roadmapSubmenu(scanner, r);
        }

        // Submenu after roadmap generated
        private static void roadmapSubmenu(Scanner scanner, Roadmap r) {
            boolean back = false;
            while (!back) {
                System.out.println("[1] View Skills");
                System.out.println("[2] View Courses");
                System.out.println("[3] View Projects");
                System.out.println("[4] View Timeline");
                System.out.println("[5] View Full Roadmap");
                System.out.println("[6] Save to File");
                System.out.println("[0] Back to Main Menu");
                int c = readInt(scanner, "Enter choice: ", 0, 6);
                switch (c) {
                    case 1:
                        DisplayEngine.printSkills(r.getSkills());
                        break;
                    case 2:
                        DisplayEngine.printCourses(r.getCourses());
                        break;
                    case 3:
                        DisplayEngine.printProjects(r.getProjects());
                        break;
                    case 4:
                        DisplayEngine.printTimeline(r.getMilestones());
                        break;
                    case 5:
                        DisplayEngine.printRoadmapSummary(r);
                        DisplayEngine.printSkills(r.getSkills());
                        DisplayEngine.printCourses(r.getCourses());
                        DisplayEngine.printProjects(r.getProjects());
                        DisplayEngine.printTimeline(r.getMilestones());
                        break;
                    case 6:
                        saveRoadmapToFile(r);
                        break;
                    case 0:
                        back = true;
                        break;
                }
            }
        }

        // Browse jobs option
        private static void browseJobs(Scanner scanner, Map<String, Roadmap> db) {
            List<String> keys = new ArrayList<>(db.keySet());
            Collections.sort(keys);
            for (int i = 0; i < keys.size(); i++) {
                Roadmap r = db.get(keys.get(i));
                System.out.printf("[%d] %s (%s demand, %s)\n", i+1, r.getJobTitle(), r.getDemandLevel(), r.getSalaryRange());
            }
            int choice = readInt(scanner, "Select a job by number: ", 1, keys.size());
            String selected = keys.get(choice-1);
            Roadmap r = db.get(selected);
            currentRoadmap = r;
            addToHistory(r.getJobTitle());
            DisplayEngine.printRoadmapSummary(r);
            roadmapSubmenu(scanner, r);
        }

        // Compare two jobs
        private static void compareJobs(Scanner scanner, Map<String, Roadmap> db) {
            System.out.print("Enter first job title: ");
            String j1 = scanner.nextLine().trim().toLowerCase();
            System.out.print("Enter second job title: ");
            String j2 = scanner.nextLine().trim().toLowerCase();
            Roadmap r1 = db.getOrDefault(j1, RoadmapDatabase.getGenericRoadmap(j1));
            Roadmap r2 = db.getOrDefault(j2, RoadmapDatabase.getGenericRoadmap(j2));
            System.out.println("\nComparison:");
            System.out.println("Job Title       | " + r1.getJobTitle() + " | " + r2.getJobTitle());
            System.out.println("Timeline        | " + r1.getTotalTimeline() + " | " + r2.getTotalTimeline());
            System.out.println("Salary          | " + r1.getSalaryRange() + " | " + r2.getSalaryRange());
            System.out.println("Demand          | " + r1.getDemandLevel() + " | " + r2.getDemandLevel());
            System.out.println("Skill Count     | " + r1.getSkills().size() + " | " + r2.getSkills().size());
            System.out.println("Top 3 Skills    | " + topSkills(r1,3) + " | " + topSkills(r2,3));
        }

        // Search skills across jobs
        private static void searchSkills(Scanner scanner, Map<String, Roadmap> db) {
            String skill = readString(scanner, "Enter skill name to search: ");
            System.out.println("Jobs requiring '" + skill + "':");
            for (String key : db.keySet()) {
                Roadmap r = db.get(key);
                for (Skill s : r.getSkills()) {
                    if (s.getName().equalsIgnoreCase(skill)) {
                        System.out.println("- " + r.getJobTitle() + " (" + s.getProficiency() + "%)");
                        break;
                    }
                }
            }
        }

        // View history
        private static void viewHistory() {
            System.out.println("Roadmap History:");
            for (int i = 0; i < history.size(); i++) {
                System.out.println("[" + (i+1) + "] " + history.get(i));
            }
        }

        // Save current roadmap to file
        private static void saveCurrentRoadmapToFile() {
            if (currentRoadmap == null) {
                System.out.println("No roadmap generated yet.");
                return;
            }
            saveRoadmapToFile(currentRoadmap);
        }

        // Utility to save a roadmap to file using jobTitle_roadmap.txt
        private static void saveRoadmapToFile(Roadmap r) {
            String filename = r.getJobTitle().toLowerCase().replaceAll(" ", "_") + "_roadmap.txt";
            try (PrintWriter out = new PrintWriter(new FileWriter(filename))) {
                out.println(r.getJobTitle() + " ROADMAP");
                out.println("Salary Range : " + r.getSalaryRange());
                out.println("Demand Level : " + r.getDemandLevel());
                out.println("Timeline : " + r.getTotalTimeline());
                out.println();
                out.println("SKILLS:");
                for (Skill s : r.getSkills()) {
                    out.printf("- %s (%s) %d%% %s\n", s.getName(), s.getCategory(), s.getProficiency(), s.getLevel());
                }
                out.println();
                out.println("COURSES:");
                for (Course c : r.getCourses()) {
                    out.printf("- %s on %s (%s) %s %s\n", c.getName(), c.getPlatform(), c.getDuration(), c.isFree() ? "FREE" : "PAID", c.getUrl());
                }
                out.println();
                out.println("PROJECTS:");
                for (Project p : r.getProjects()) {
                    out.printf("- %s [%s] %s ( %s ) %d days\n", p.getName(), p.getDifficulty(), p.getDescription(), String.join(", ", p.getTechStack()), p.getEstimatedDays());
                }
                out.println();
                out.println("TIMELINE:");
                for (Milestone m : r.getMilestones()) {
                    out.println(m.getPeriod() + ": " + m.getTitle());
                    for (String g : m.getGoals()) {
                        out.println("   * " + g);
                    }
                }
                System.out.println("Roadmap saved to " + filename);
            } catch (IOException e) {
                System.out.println("Error writing file: " + e.getMessage());
            }
        }

        // About screen
        private static void about() {
            System.out.println("╔══════════════════════════════════════╗");
            System.out.println("║         ABOUT THIS APPLICATION       ║");
            System.out.println("║                                      ║");
            System.out.println("║  Version  : 1.0.0                    ║");
            System.out.println("║  Purpose  : Career Roadmap Generator ║");
            System.out.println("║  Built    : Java (Console App)       ║");
            System.out.println("║  Project  : Reverse Resume Generator ║");
            System.out.println("║  Course   : DSA / FWD Project        ║");
            System.out.println("╚══════════════════════════════════════╝");
        }

        // Add job title to history keeping max 5
        private static void addToHistory(String title) {
            history.remove(title);
            history.add(0, title);
            if (history.size() > 5) history.remove(history.size()-1);
        }

        // Get top n skills names
        private static String topSkills(Roadmap r, int n) {
            return r.getSkills().stream()
                    .sorted((a,b) -> Integer.compare(b.getProficiency(), a.getProficiency()))
                    .limit(n)
                    .map(Skill::getName)
                    .collect(Collectors.joining(", "));
        }
    }
}
