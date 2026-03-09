/* ==================== ROADMAP DATA ==================== */
/**
 * Core data structure containing comprehensive career roadmaps
 * Each job title maps to skills, courses, projects, and milestones
 */
const roadmapData = {
    "ai engineer": {
        title: "AI Engineer",
        timeline: "12-18 months",
        skills: [
            { name: "Python", category: "Programming", level: 90, difficulty: "beginner" },
            { name: "Machine Learning", category: "AI/ML", level: 85, difficulty: "intermediate" },
            { name: "Deep Learning", category: "AI/ML", level: 75, difficulty: "advanced" },
            { name: "TensorFlow/PyTorch", category: "Tools", level: 80, difficulty: "intermediate" },
            { name: "Data Structures", category: "Programming", level: 85, difficulty: "beginner" },
            { name: "Linear Algebra", category: "Math", level: 70, difficulty: "intermediate" },
            { name: "Computer Vision", category: "AI/ML", level: 65, difficulty: "advanced" },
            { name: "NLP", category: "AI/ML", level: 70, difficulty: "advanced" },
        ],
        courses: [
            { name: "Machine Learning (Andrew Ng)", platform: "Coursera", duration: "11 weeks", free: false },
            { name: "Deep Learning Specialization", platform: "Coursera", duration: "4 months", free: false },
            { name: "TensorFlow Developer Cert", platform: "TensorFlow", duration: "8 weeks", free: false },
            { name: "PyTorch Fundamentals", platform: "Udacity", duration: "6 weeks", free: false },
            { name: "Kaggle ML Fundamentals", platform: "Kaggle", duration: "4 weeks", free: true },
        ],
        projects: [
            { name: "Iris Flower Classifier", description: "Classic ML project using decision trees and SVM", stack: ["Python", "Scikit-learn", "Pandas"], difficulty: "beginner" },
            { name: "Stock Price Predictor", description: "LSTM neural network for time series forecasting", stack: ["Python", "TensorFlow", "Pandas"], difficulty: "intermediate" },
            { name: "Image Classification CNN", description: "Convolutional neural network for CIFAR-10 dataset", stack: ["Python", "PyTorch", "OpenCV"], difficulty: "intermediate" },
            { name: "Chatbot with NLP", description: "Transformer-based conversational AI system", stack: ["Python", "Hugging Face", "NLTK"], difficulty: "advanced" },
            { name: "Sentiment Analysis API", description: "End-to-end ML pipeline with deployment", stack: ["Python", "Flask", "BERT", "Docker"], difficulty: "advanced" },
        ],
        milestones: [
            { month: "Month 1-2", title: "Python & Math Foundation", description: "Master Python basics, linear algebra, and calculus for ML" },
            { month: "Month 3-4", title: "ML Fundamentals", description: "Learn supervised/unsupervised learning algorithms" },
            { month: "Month 5-6", title: "Deep Learning Intro", description: "Neural networks, backpropagation, and frameworks" },
            { month: "Month 7-8", title: "Specialization Track", description: "Choose: CV, NLP, or Generative AI focus" },
            { month: "Month 9-12", title: "Advanced Projects", description: "Build production-ready ML systems" },
            { month: "Month 13-18", title: "Portfolio & Job Hunt", description: "Deploy projects, contribute to open source, interview prep" },
        ]
    },
    "full stack developer": {
        title: "Full Stack Developer",
        timeline: "10-15 months",
        skills: [
            { name: "JavaScript", category: "Frontend", level: 90, difficulty: "beginner" },
            { name: "React", category: "Frontend", level: 85, difficulty: "intermediate" },
            { name: "HTML/CSS", category: "Frontend", level: 95, difficulty: "beginner" },
            { name: "Node.js", category: "Backend", level: 80, difficulty: "intermediate" },
            { name: "Express.js", category: "Backend", level: 75, difficulty: "intermediate" },
            { name: "MongoDB", category: "Database", level: 80, difficulty: "intermediate" },
            { name: "SQL", category: "Database", level: 85, difficulty: "beginner" },
            { name: "REST APIs", category: "Backend", level: 85, difficulty: "intermediate" },
            { name: "Git & GitHub", category: "Tools", level: 85, difficulty: "beginner" },
            { name: "Docker", category: "DevOps", level: 70, difficulty: "advanced" },
        ],
        courses: [
            { name: "The Complete Web Dev Bootcamp", platform: "Udemy", duration: "60 hours", free: false },
            { name: "React - The Complete Guide", platform: "Udemy", duration: "50 hours", free: false },
            { name: "Node.js - The Complete Guide", platform: "Udemy", duration: "40 hours", free: false },
            { name: "MongoDB Basics", platform: "MongoDB University", duration: "20 hours", free: true },
            { name: "Full Stack Open", platform: "University of Helsinki", duration: "12 weeks", free: true },
        ],
        projects: [
            { name: "Todo App", description: "Full stack todo list with authentication", stack: ["React", "Node.js", "MongoDB"], difficulty: "beginner" },
            { name: "E-Commerce Site", description: "Complete online store with payment integration", stack: ["React", "Express", "MongoDB", "Stripe"], difficulty: "intermediate" },
            { name: "Social Media App", description: "Twitter-like platform with real-time features", stack: ["React", "Node.js", "PostgreSQL", "Socket.io"], difficulty: "intermediate" },
            { name: "SaaS Dashboard", description: "Multi-tenant analytics dashboard", stack: ["React", "Express", "PostgreSQL", "Docker"], difficulty: "advanced" },
            { name: "AI Chat Platform", description: "Production chatbot with AI backend", stack: ["React", "Next.js", "FastAPI", "OpenAI API"], difficulty: "advanced" },
        ],
        milestones: [
            { month: "Month 1-2", title: "Frontend Fundamentals", description: "HTML, CSS, JavaScript basics and ES6+" },
            { month: "Month 3-4", title: "React Mastery", description: "Components, hooks, state management, routing" },
            { month: "Month 5-6", title: "Backend Basics", description: "Node.js, Express, RESTful APIs" },
            { month: "Month 7-8", title: "Database Design", description: "SQL, MongoDB, data modeling" },
            { month: "Month 9-10", title: "Full Stack Projects", description: "Build complete applications" },
            { month: "Month 11-15", title: "DevOps & Deployment", description: "Docker, CI/CD, cloud deployment" },
        ]
    },
    "ui ux designer": {
        title: "UI/UX Designer",
        timeline: "8-12 months",
        skills: [
            { name: "Figma", category: "Design Tools", level: 90, difficulty: "beginner" },
            { name: "User Research", category: "UX", level: 80, difficulty: "beginner" },
            { name: "Wireframing", category: "UX", level: 85, difficulty: "beginner" },
            { name: "Prototyping", category: "UX", level: 80, difficulty: "intermediate" },
            { name: "Visual Design", category: "UI", level: 85, difficulty: "beginner" },
            { name: "Interaction Design", category: "UX", level: 75, difficulty: "intermediate" },
            { name: "Usability Testing", category: "UX", level: 75, difficulty: "intermediate" },
            { name: "Design Systems", category: "UI", level: 70, difficulty: "advanced" },
            { name: "CSS/HTML", category: "Frontend", level: 70, difficulty: "intermediate" },
            { name: "Adobe XD", category: "Design Tools", level: 75, difficulty: "beginner" },
        ],
        courses: [
            { name: "Google UX Design Certificate", platform: "Coursera", duration: "6 months", free: false },
            { name: "Interaction Design Foundation", platform: "IxDF", duration: "Self-paced", free: true },
            { name: "Figma Masterclass", platform: "Udemy", duration: "20 hours", free: false },
            { name: "Laws of UX", platform: "School of Motion", duration: "4 weeks", free: true },
            { name: "Design Thinking Workshop", platform: "Interaction Design", duration: "2 weeks", free: true },
        ],
        projects: [
            { name: "Portfolio Website Redesign", description: "Redesign a personal portfolio for better conversions", stack: ["Figma", "HTML", "CSS"], difficulty: "beginner" },
            { name: "Mobile App Design", description: "Complete UI/UX for a social app", stack: ["Figma", "Prototyping"], difficulty: "intermediate" },
            { name: "Ecommerce Platform Overhaul", description: "Redesign user journey and checkout flow", stack: ["Figma", "User Research", "Testing"], difficulty: "intermediate" },
            { name: "Design System", description: "Build and document a comprehensive design system", stack: ["Figma", "Design Tokens"], difficulty: "advanced" },
            { name: "SaaS Dashboard", description: "Design complex data visualization dashboard", stack: ["Figma", "Adobe XD", "Prototyping"], difficulty: "advanced" },
        ],
        milestones: [
            { month: "Month 1", title: "Design Fundamentals", description: "Color theory, typography, composition" },
            { month: "Month 2-3", title: "UX Research Methods", description: "User interviews, surveys, analytics" },
            { month: "Month 4-5", title: "Design Tools Mastery", description: "Figma, Adobe XD, Prototyping tools" },
            { month: "Month 6-7", title: "UI Design Skills", description: "Components, patterns, design systems" },
            { month: "Month 8-10", title: "Real Projects", description: "Case studies and portfolio projects" },
            { month: "Month 11-12", title: "Portfolio & Job Search", description: "Polish portfolio, network, interviews" },
        ]
    },
    "data scientist": {
        title: "Data Scientist",
        timeline: "12-16 months",
        skills: [
            { name: "Python", category: "Programming", level: 90, difficulty: "beginner" },
            { name: "Statistical Analysis", category: "Analytics", level: 80, difficulty: "intermediate" },
            { name: "Data Visualization", category: "Analytics", level: 85, difficulty: "beginner" },
            { name: "Pandas", category: "Tools", level: 85, difficulty: "beginner" },
            { name: "SQL", category: "Database", level: 85, difficulty: "beginner" },
            { name: "Machine Learning", category: "Analytics", level: 80, difficulty: "intermediate" },
            { name: "Tableau", category: "Tools", level: 75, difficulty: "intermediate" },
            { name: "A/B Testing", category: "Analytics", level: 75, difficulty: "intermediate" },
            { name: "Big Data Tools", category: "Tools", level: 65, difficulty: "advanced" },
            { name: "Communication", category: "Soft Skills", level: 80, difficulty: "intermediate" },
        ],
        courses: [
            { name: "Data Science with Python", platform: "DataCamp", duration: "40 hours", free: false },
            { name: "SQL for Data Analysis", platform: "Udacity", duration: "20 hours", free: true },
            { name: "Statistics Fundamentals", platform: "Coursera", duration: "6 weeks", free: true },
            { name: "Tableau Essentials", platform: "Udemy", duration: "12 hours", free: false },
            { name: "Google Data Analytics Certificate", platform: "Coursera", duration: "6 months", free: false },
        ],
        projects: [
            { name: "Exploratory Data Analysis", description: "Clean, explore, and visualize a complex dataset", stack: ["Python", "Pandas", "Matplotlib"], difficulty: "beginner" },
            { name: "Customer Churn Prediction", description: "Build ML model to predict customer churn", stack: ["Python", "Scikit-learn", "Pandas"], difficulty: "intermediate" },
            { name: "A/B Test Analysis", description: "Design and analyze statistical experiments", stack: ["Python", "StatsModels", "Tableau"], difficulty: "intermediate" },
            { name: "Dashboard Creation", description: "Build interactive analytics dashboard", stack: ["Tableau", "SQL", "Python"], difficulty: "intermediate" },
            { name: "Time Series Forecasting", description: "Forecast business metrics with ARIMA/Prophet", stack: ["Python", "Prophet", "Statsmodels"], difficulty: "advanced" },
        ],
        milestones: [
            { month: "Month 1-2", title: "Python & SQL Fundamentals", description: "Programming basics and database querying" },
            { month: "Month 3-4", title: "Statistics & Probability", description: "Hypothesis testing, distributions, regression" },
            { month: "Month 5-6", title: "Data Analysis with Pandas", description: "Data cleaning, transformation, exploration" },
            { month: "Month 7-8", title: "Data Visualization", description: "Creating insights with Tableau and Python" },
            { month: "Month 9-12", title: "ML & Modeling", description: "Building predictive and classification models" },
            { month: "Month 13-16", title: "Portfolio & Job Search", description: "Real-world projects, interviews, negotiation" },
        ]
    },
    "frontend developer": {
        title: "Frontend Developer",
        timeline: "8-12 months",
        skills: [
            { name: "HTML", category: "Frontend", level: 95, difficulty: "beginner" },
            { name: "CSS", category: "Frontend", level: 90, difficulty: "beginner" },
            { name: "JavaScript", category: "Frontend", level: 90, difficulty: "beginner" },
            { name: "React", category: "Frontend", level: 85, difficulty: "intermediate" },
            { name: "Responsive Design", category: "Frontend", level: 85, difficulty: "beginner" },
            { name: "Web APIs", category: "Frontend", level: 80, difficulty: "intermediate" },
            { name: "Git", category: "Tools", level: 80, difficulty: "beginner" },
            { name: "Testing", category: "Frontend", level: 75, difficulty: "intermediate" },
            { name: "Performance Optimization", category: "Frontend", level: 70, difficulty: "advanced" },
            { name: "Accessibility", category: "Frontend", level: 75, difficulty: "intermediate" },
        ],
        courses: [
            { name: "FreeCodeCamp Web Development", platform: "FreeCodeCamp", duration: "300 hours", free: true },
            { name: "The Complete Web Developer Bootcamp", platform: "Udemy", duration: "60 hours", free: false },
            { name: "React for Beginners", platform: "Wes Bos", duration: "30 hours", free: false },
            { name: "JavaScript MCU", platform: "Udemy", duration: "40 hours", free: false },
            { name: "Web Dev for Beginners", platform: "Microsoft", duration: "12 weeks", free: true },
        ],
        projects: [
            { name: "Personal Portfolio", description: "Showcase your skills with a responsive website", stack: ["HTML", "CSS", "JavaScript"], difficulty: "beginner" },
            { name: "Weather App", description: "Real-time weather dashboard using APIs", stack: ["React", "JavaScript", "API"], difficulty: "beginner" },
            { name: "Movie Database App", description: "Browse and search movies with React", stack: ["React", "API", "State Management"], difficulty: "intermediate" },
            { name: "E-Commerce Frontend", description: "Product catalog with shopping cart", stack: ["React", "Redux", "CSS"], difficulty: "intermediate" },
            { name: "Real-time Chat Interface", description: "Live messaging app frontend", stack: ["React", "WebSockets", "Redux"], difficulty: "advanced" },
        ],
        milestones: [
            { month: "Month 1-2", title: "Web Fundamentals", description: "HTML, CSS, and JavaScript basics" },
            { month: "Month 3-4", title: "Responsive Design", description: "Mobile-first, flexbox, grid" },
            { month: "Month 5-6", title: "JavaScript Advanced", description: "DOM manipulation, async, ES6+" },
            { month: "Month 7-8", title: "React Fundamentals", description: "Components, JSX, hooks, routing" },
            { month: "Month 9-10", title: "Professional Projects", description: "Build portfolio projects" },
            { month: "Month 11-12", title: "Job Search & Interview Prep", description: "Resume, portfolio, technical interviews" },
        ]
    },
    "backend developer": {
        title: "Backend Developer",
        timeline: "10-14 months",
        skills: [
            { name: "Node.js", category: "Backend", level: 85, difficulty: "intermediate" },
            { name: "JavaScript", category: "Programming", level: 90, difficulty: "beginner" },
            { name: "Express.js", category: "Backend", level: 80, difficulty: "intermediate" },
            { name: "REST APIs", category: "Backend", level: 85, difficulty: "intermediate" },
            { name: "SQL", category: "Database", level: 85, difficulty: "beginner" },
            { name: "MongoDB", category: "Database", level: 80, difficulty: "intermediate" },
            { name: "Authentication", category: "Backend", level: 75, difficulty: "intermediate" },
            { name: "Caching", category: "Backend", level: 70, difficulty: "advanced" },
            { name: "Microservices", category: "Backend", level: 65, difficulty: "advanced" },
            { name: "Database Design", category: "Database", level: 75, difficulty: "intermediate" },
        ],
        courses: [
            { name: "Node.js - The Complete Guide", platform: "Udemy", duration: "40 hours", free: false },
            { name: "Express.js Tutorial", platform: "Udemy", duration: "20 hours", free: false },
            { name: "REST API Design Best Practices", platform: "Udacity", duration: "6 weeks", free: true },
            { name: "PostgreSQL Complete", platform: "Udemy", duration: "30 hours", free: false },
            { name: "System Design Interview", platform: "System Design Primer", duration: "Self-paced", free: true },
        ],
        projects: [
            { name: "RESTful Blog API", description: "Build a complete blog API with authentication", stack: ["Node.js", "Express", "MongoDB"], difficulty: "beginner" },
            { name: "User Authentication System", description: "JWT-based auth with password hashing", stack: ["Express", "JWT", "PostgreSQL"], difficulty: "intermediate" },
            { name: "Real-time Notification Server", description: "WebSocket-based notification system", stack: ["Node.js", "Socket.io", "Redis"], difficulty: "intermediate" },
            { name: "Payment Processing API", description: "Integrate payment gateway (Stripe/PayPal)", stack: ["Express", "Stripe", "PostgreSQL"], difficulty: "advanced" },
            { name: "Microservices Architecture", description: "Multiple services with message queues", stack: ["Node.js", "RabbitMQ", "Docker"], difficulty: "advanced" },
        ],
        milestones: [
            { month: "Month 1-2", title: "JavaScript & Node.js Basics", description: "Language fundamentals and Node.js ecosystem" },
            { month: "Month 3-4", title: "Express & API Development", description: "Building RESTful APIs and routing" },
            { month: "Month 5-6", title: "Database Mastery", description: "SQL, MongoDB, data modeling" },
            { month: "Month 7-8", title: "Security & Authentication", description: "JWT, OAuth, password security" },
            { month: "Month 9-10", title: "Advanced Patterns", description: "Caching, queuing, middleware" },
            { month: "Month 11-14", title: "System Design & Job Search", description: "Architecture, scaling, interviews" },
        ]
    },
    "devops engineer": {
        title: "DevOps Engineer",
        timeline: "12-18 months",
        skills: [
            { name: "Linux", category: "Infrastructure", level: 85, difficulty: "beginner" },
            { name: "Docker", category: "Containerization", level: 85, difficulty: "intermediate" },
            { name: "Kubernetes", category: "Orchestration", level: 80, difficulty: "advanced" },
            { name: "Git", category: "VCS", level: 85, difficulty: "beginner" },
            { name: "CI/CD Pipelines", category: "DevOps", level: 80, difficulty: "intermediate" },
            { name: "Jenkins", category: "DevOps", level: 75, difficulty: "intermediate" },
            { name: "AWS", category: "Cloud", level: 80, difficulty: "intermediate" },
            { name: "Terraform", category: "IaC", level: 75, difficulty: "intermediate" },
            { name: "Monitoring & Logging", category: "DevOps", level: 75, difficulty: "intermediate" },
            { name: "Network Security", category: "Security", level: 70, difficulty: "advanced" },
        ],
        courses: [
            { name: "Docker & Kubernetes Masterclass", platform: "Udemy", duration: "40 hours", free: false },
            { name: "Linux Administration", platform: "Linux Academy", duration: "50 hours", free: false },
            { name: "AWS Developer Associate", platform: "A Cloud Guru", duration: "30 hours", free: false },
            { name: "CI/CD with Jenkins", platform: "Udemy", duration: "20 hours", free: false },
            { name: "Infrastructure as Code", platform: "Pluralsight", duration: "25 hours", free: false },
        ],
        projects: [
            { name: "Docker Containerization", description: "Containerize a multi-app project", stack: ["Docker", "Docker Compose"], difficulty: "beginner" },
            { name: "Kubernetes Deployment", description: "Deploy apps on Kubernetes cluster", stack: ["Kubernetes", "Helm"], difficulty: "intermediate" },
            { name: "CI/CD Pipeline Setup", description: "Automated testing and deployment pipeline", stack: ["Jenkins", "Git", "Docker"], difficulty: "intermediate" },
            { name: "Infrastructure with Terraform", description: "Manage AWS infrastructure as code", stack: ["Terraform", "AWS", "Ansible"], difficulty: "advanced" },
            { name: "Monitoring & Alerting Stack", description: "Complete observability solution", stack: ["Prometheus", "Grafana", "ELK Stack"], difficulty: "advanced" },
        ],
        milestones: [
            { month: "Month 1-2", title: "Linux & Shell Scripting", description: "Command line mastery and automation scripts" },
            { month: "Month 3-4", title: "Containerization Basics", description: "Docker fundamentals and best practices" },
            { month: "Month 5-6", title: "Orchestration & Scaling", description: "Kubernetes and container orchestration" },
            { month: "Month 7-8", title: "Cloud Platforms", description: "AWS, Azure, or GCP essentials" },
            { month: "Month 9-12", title: "CI/CD & Infrastructure", description: "Pipelines, IaC, automation tools" },
            { month: "Month 13-18", title: "Advanced DevOps", description: "Security, monitoring, large-scale systems" },
        ]
    },
    "cybersecurity analyst": {
        title: "Cybersecurity Analyst",
        timeline: "14-20 months",
        skills: [
            { name: "Network Security", category: "Security", level: 80, difficulty: "intermediate" },
            { name: "Linux", category: "Systems", level: 85, difficulty: "intermediate" },
            { name: "Vulnerability Assessment", category: "Security", level: 75, difficulty: "intermediate" },
            { name: "Encryption", category: "Security", level: 75, difficulty: "intermediate" },
            { name: "Firewalls & IDS", category: "Security", level: 80, difficulty: "intermediate" },
            { name: "Incident Response", category: "Security", level: 75, difficulty: "advanced" },
            { name: "Penetration Testing", category: "Security", level: 70, difficulty: "advanced" },
            { name: "SIEM Tools", category: "Security", level: 70, difficulty: "intermediate" },
            { name: "Compliance & Standards", category: "Security", level: 75, difficulty: "intermediate" },
            { name: "Malware Analysis", category: "Security", level: 60, difficulty: "advanced" },
        ],
        courses: [
            { name: "CompTIA Security+", platform: "Udemy", duration: "40 hours", free: false },
            { name: "CEH Certified Ethical Hacker", platform: "EC-Council", duration: "60 hours", free: false },
            { name: "Cybersecurity Fundamentals", platform: "Coursera", duration: "6 months", free: true },
            { name: "Network Security Essentials", platform: "Cisco NetAcad", duration: "60 hours", free: true },
            { name: "SANS Cyber Academy", platform: "SANS", duration: "Self-paced", free: false },
        ],
        projects: [
            { name: "Network Vulnerability Scan", description: "Scan and identify network vulnerabilities", stack: ["Nmap", "Nessus", "Linux"], difficulty: "beginner" },
            { name: "Penetration Testing Report", description: "Perform pentest and document findings", stack: ["Metasploit", "Burp Suite"], difficulty: "intermediate" },
            { name: "Firewall Configuration", description: "Design and implement firewall rules", stack: ["Palo Alto", "Linux Firewall"], difficulty: "intermediate" },
            { name: "Incident Response Plan", description: "Create incident response procedures", stack: ["SIEM Tools", "Documentation"], difficulty: "advanced" },
            { name: "Security Audit", description: "Complete security assessment of systems", stack: ["Various Tools", "Compliance"], difficulty: "advanced" },
        ],
        milestones: [
            { month: "Month 1-2", title: "Security Fundamentals", description: "Cryptography, networking, protocols" },
            { month: "Month 3-4", title: "Linux & System Administration", description: "Linux security, user management" },
            { month: "Month 5-8", title: "Network & Firewall Security", description: "Network architecture, firewalls, IDS" },
            { month: "Month 9-12", title: "Vulnerability Assessment", description: "Tools, scanning, risk analysis" },
            { month: "Month 13-16", title: "Penetration Testing", description: "Ethical hacking, exploitation techniques" },
            { month: "Month 17-20", title: "Advanced Topics & Certifications", description: "Incident response, compliance, SIEM" },
        ]
    }
};

/* ==================== DOM ELEMENTS ==================== */
const jobInput = document.getElementById('jobInput');
const generateBtn = document.getElementById('generateBtn');
const heroSubtitle = document.querySelector('.hero-subtitle');
const roadmapOutput = document.getElementById('roadmapOutput');
const themeToggle = document.getElementById('themeToggle');
const loadingSpinner = document.getElementById('loadingSpinner');
const devConsoleEl = document.getElementById('devConsole');
const consoleInput = document.getElementById('consoleInput');
const consoleOutput = document.getElementById('consoleOutput');
const closeConsole = document.getElementById('closeConsole');

/* ==================== INITIALIZATION ==================== */
/**
 * Initialize the application on page load
 */
window.addEventListener('DOMContentLoaded', () => {
    loadThemePreference();
    setupTypingEffect();
    setupIntersectionObserver();
    setupEventListeners();
    setupExampleCards();
    setupDevConsole();
});

/* ==================== THEME TOGGLE ==================== */
/**
 * Toggle between dark and light mode
 * Saves preference to localStorage
 */
function toggleDarkMode() {
    const isDark = document.body.classList.toggle('light-mode');
    const icon = isDark ? '☀️' : '🌙';
    themeToggle.querySelector('.theme-icon').textContent = icon;
    localStorage.setItem('theme', isDark ? 'light' : 'dark');
}

/**
 * Load theme preference from localStorage
 */
function loadThemePreference() {
    const theme = localStorage.getItem('theme') || 'dark';
    if (theme === 'light') {
        document.body.classList.add('light-mode');
        themeToggle.querySelector('.theme-icon').textContent = '☀️';
    }
}

/* ==================== TYPING EFFECT ==================== */
/**
 * Create typing effect for hero subtitle
 */
function setupTypingEffect() {
    const subtitle = "Reverse your job search. Start with the destination, then build the skills.";
    let index = 0;

    function type() {
        if (index < subtitle.length) {
            heroSubtitle.textContent += subtitle.charAt(index);
            index++;
            setTimeout(type, 30);
        }
    }

    type();
}

/* ==================== EVENT LISTENERS ==================== */
/**
 * Setup all event listeners for the application
 */
function setupEventListeners() {
    generateBtn.addEventListener('click', handleGenerateRoadmap);
    jobInput.addEventListener('keypress', (e) => {
        if (e.key === 'Enter') handleGenerateRoadmap();
    });
    themeToggle.addEventListener('click', toggleDarkMode);

    // Tab switching
    document.querySelectorAll('.tab-button').forEach(button => {
        button.addEventListener('click', () => switchTab(button.dataset.tab));
    });

    // Copy and Download buttons
    document.getElementById('copyBtn')?.addEventListener('click', copyRoadmapToClipboard);
    document.getElementById('downloadBtn')?.addEventListener('click', downloadAsJSON);
}

/* ==================== ROADMAP GENERATION ==================== */
/**
 * Main function to handle roadmap generation
 */
function handleGenerateRoadmap() {
    const jobTitle = jobInput.value.trim().toLowerCase();

    if (!jobTitle) {
        alert('Please enter a job title');
        return;
    }

    // Show loading spinner
    loadingSpinner.style.display = 'flex';

    // Simulate API delay
    setTimeout(() => {
        generateRoadmap(jobTitle);
        loadingSpinner.style.display = 'none';
        scrollToRoadmap();
    }, 300);
}

/**
 * Generate and display the roadmap
 * @param {string} jobTitle - The job title to generate roadmap for
 */
function generateRoadmap(jobTitle) {
    const data = roadmapData[jobTitle] || handleUnknownJob(jobTitle);

    if (!data) return;

    // Update roadmap header
    document.getElementById('roadmapJobTitle').textContent = data.title;
    document.getElementById('roadmapTimeline').textContent = `Timeline: ${data.timeline}`;

    // Render all sections
    renderSkills(data.skills);
    renderCourses(data.courses);
    renderProjects(data.projects);
    renderTimeline(data.milestones);

    // Show roadmap section
    roadmapOutput.style.display = 'block';
    roadmapOutput.classList.add('slide-up');

    // Switch to skills tab by default
    switchTab('skills');

    // Save to localStorage
    localStorage.setItem('lastJob', jobTitle);
}

/**
 * Handle unknown job titles with generic roadmap
 * @param {string} jobTitle - Unknown job title
 */
function handleUnknownJob(jobTitle) {
    const genericRoadmap = {
        title: `${jobTitle} Roadmap`,
        timeline: "8-12 months (estimated)",
        skills: [
            { name: "Research the Role", category: "Preparation", level: 50, difficulty: "beginner" },
            { name: "Find Learning Resources", category: "Preparation", level: 50, difficulty: "beginner" },
            { name: "Build Foundation Skills", category: "Core", level: 60, difficulty: "beginner" },
            { name: "Practice & Projects", category: "Core", level: 70, difficulty: "intermediate" },
            { name: "Advanced Specialization", category: "Advanced", level: 80, difficulty: "advanced" },
        ],
        courses: [
            { name: "Research relevant courses on Coursera", platform: "Coursera", duration: "Variable", free: false },
            { name: "Check Udemy for specialized topics", platform: "Udemy", duration: "Variable", free: false },
            { name: "Explore YouTube tutorials", platform: "YouTube", duration: "Self-paced", free: true },
            { name: "Join communities for your field", platform: "Communities", duration: "Ongoing", free: true },
        ],
        projects: [
            { name: "Beginner Project", description: "Start with fundamentals", stack: ["TBD"], difficulty: "beginner" },
            { name: "Intermediate Project", description: "Apply learned skills", stack: ["TBD"], difficulty: "intermediate" },
            { name: "Advanced Project", description: "Build portfolio-worthy work", stack: ["TBD"], difficulty: "advanced" },
        ],
        milestones: [
            { month: "Month 1-2", title: "Research & Planning", description: "Understand the role and requirements" },
            { month: "Month 3-4", title: "Foundation Learning", description: "Build core competencies" },
            { month: "Month 5-8", title: "Skill Development", description: "Practice and improve continuously" },
            { month: "Month 9-12", title: "Portfolio & Interview Prep", description: "Prepare for job search" },
        ]
    };

    // Show suggestion message
    const suggestion = document.createElement('div');
    suggestion.style.cssText = `
        background: rgba(255, 215, 0, 0.1);
        border: 2px solid rgba(255, 215, 0, 0.5);
        border-radius: 10px;
        padding: 20px;
        margin-bottom: 20px;
        color: var(--text-primary);
    `;
    suggestion.innerHTML = `
        <strong>🔍 Generic Roadmap Generated</strong><br>
        We couldn't find "${jobTitle}" in our database. This is a generic roadmap.
        Consider searching for similar roles like: ${Object.keys(roadmapData).slice(0, 3).join(', ')}.
    `;
    roadmapOutput.insertBefore(suggestion, document.querySelector('.roadmap-header').nextSibling);

    return genericRoadmap;
}

/* ==================== RENDERING FUNCTIONS ==================== */
/**
 * Render skill cards with progress bars
 * @param {Array} skills - Array of skill objects
 */
function renderSkills(skills) {
    const container = document.getElementById('skillsContainer');
    container.innerHTML = '';

    skills.forEach((skill, index) => {
        const skillCard = document.createElement('div');
        skillCard.className = 'skill-card slide-up';
        skillCard.style.animationDelay = `${index * 0.1}s`;

        const badgeClass = skill.difficulty === 'advanced' ? 'advanced' : 
                          skill.difficulty === 'intermediate' ? 'intermediate' : 'beginner';

        skillCard.innerHTML = `
            <div class="skill-name">${skill.name}</div>
            <div class="skill-meta">
                <span class="skill-badge">${skill.category}</span>
                <span class="skill-badge ${badgeClass}">${skill.difficulty}</span>
            </div>
            <div class="progress-bar">
                <div class="progress-fill" style="width: ${skill.level}%"></div>
            </div>
            <p style="margin-top: 0.5rem; color: var(--text-secondary); font-size: 0.85rem;">${skill.level}%</p>
        `;

        container.appendChild(skillCard);
    });

    // Animate progress bars
    setTimeout(animateProgressBars, 300);
}

/**
 * Animate progress bars when shown
 */
function animateProgressBars() {
    const fills = document.querySelectorAll('.progress-fill');
    fills.forEach(fill => {
        const width = fill.style.width;
        fill.style.width = '0%';
        setTimeout(() => {
            fill.style.width = width;
        }, 50);
    });
}

/**
 * Render course cards
 * @param {Array} courses - Array of course objects
 */
function renderCourses(courses) {
    const container = document.getElementById('coursesContainer');
    container.innerHTML = '';

    courses.forEach((course, index) => {
        const courseCard = document.createElement('div');
        courseCard.className = 'course-card slide-up';
        courseCard.style.animationDelay = `${index * 0.1}s`;

        const typeLabel = course.free ? '✓ Free' : '💳 Paid';
        const typeClass = course.free ? '' : 'paid';

        courseCard.innerHTML = `
            <div class="course-icon">📚</div>
            <div class="course-name">${course.name}</div>
            <span class="course-platform">${course.platform}</span>
            <div class="course-duration">⏱️ ${course.duration}</div>
            <span class="course-type ${typeClass}">${typeLabel}</span>
        `;

        container.appendChild(courseCard);
    });
}

/**
 * Render project cards
 * @param {Array} projects - Array of project objects
 */
function renderProjects(projects) {
    const container = document.getElementById('projectsContainer');
    container.innerHTML = '';

    projects.forEach((project, index) => {
        const projectCard = document.createElement('div');
        projectCard.className = 'project-card slide-up';
        projectCard.style.animationDelay = `${index * 0.1}s`;

        const difficultyClass = project.difficulty === 'advanced' ? 'advanced' : 
                               project.difficulty === 'intermediate' ? 'intermediate' : '';

        const tagsHTML = project.stack.map(tag => 
            `<span class="tech-tag">${tag}</span>`
        ).join('');

        projectCard.innerHTML = `
            <div class="project-name">🏗️ ${project.name}</div>
            <p class="project-description">${project.description}</p>
            <span class="project-difficulty ${difficultyClass}">${project.difficulty}</span>
            <div class="project-tags">
                ${tagsHTML}
            </div>
        `;

        container.appendChild(projectCard);
    });
}

/**
 * Render timeline with milestones
 * @param {Array} milestones - Array of milestone objects
 */
function renderTimeline(milestones) {
    const container = document.getElementById('timelineContainer');
    container.innerHTML = '';

    const icons = ['🎯', '📚', '💡', '🚀', '⭐', '🎖️'];

    milestones.forEach((milestone, index) => {
        const milestoneEl = document.createElement('div');
        milestoneEl.className = 'milestone slide-up';
        milestoneEl.style.animationDelay = `${index * 0.1}s`;

        const icon = icons[index % icons.length];

        milestoneEl.innerHTML = `
            <div class="milestone-dot">${icon}</div>
            <div class="milestone-content">
                <div class="milestone-time">${milestone.month}</div>
                <div class="milestone-title">${milestone.title}</div>
                <p class="milestone-description">${milestone.description}</p>
            </div>
        `;

        container.appendChild(milestoneEl);
    });
}

/* ==================== TAB SWITCHING ==================== */
/**
 * Switch between different tabs
 * @param {string} tabName - Name of the tab to show
 */
function switchTab(tabName) {
    // Update active buttons
    document.querySelectorAll('.tab-button').forEach(btn => {
        btn.classList.remove('active');
    });
    document.querySelector(`[data-tab="${tabName}"]`).classList.add('active');

    // Update active content
    document.querySelectorAll('.tab-content').forEach(content => {
        content.classList.remove('active');
    });
    document.getElementById(`${tabName}-tab`).classList.add('active');

    // Animate progress bars if skills tab
    if (tabName === 'skills') {
        setTimeout(animateProgressBars, 200);
    }
}

/* ==================== SCROLL INTERSECTION OBSERVER ==================== */
/**
 * Setup intersection observer for scroll animations
 */
function setupIntersectionObserver() {
    const observer = new IntersectionObserver((entries) => {
        entries.forEach(entry => {
            if (entry.isIntersecting) {
                entry.target.classList.add('slide-up');
                observer.unobserve(entry.target);
            }
        });
    }, {
        threshold: 0.1
    });

    document.querySelectorAll('.step-card, .example-card').forEach(card => {
        observer.observe(card);
    });
}

/* ==================== EXAMPLE CARDS ==================== */
/**
 * Setup click handlers for example cards
 */
function setupExampleCards() {
    document.querySelectorAll('.example-card').forEach(card => {
        card.addEventListener('click', () => {
            const jobTitle = card.dataset.job;
            jobInput.value = jobTitle;
            generateBtn.click();
        });
    });
}

/* ==================== COPY & DOWNLOAD ==================== */
/**
 * Copy roadmap to clipboard as text
 */
function copyRoadmapToClipboard() {
    const jobTitle = document.getElementById('roadmapJobTitle').textContent;
    const timeline = document.getElementById('roadmapTimeline').textContent;

    const skillsText = Array.from(document.querySelectorAll('.skill-card'))
        .map(card => {
            const name = card.querySelector('.skill-name').textContent;
            const meta = card.querySelector('.skill-meta').textContent;
            return `- ${name} (${meta})`;
        }).join('\n');

    const text = `
Career Roadmap: ${jobTitle}
${timeline}

SKILLS TO DEVELOP:
${skillsText}

--- Full roadmap includes courses, projects, and timeline milestones ---
    `.trim();

    navigator.clipboard.writeText(text).then(() => {
        const btn = document.getElementById('copyBtn');
        const originalText = btn.textContent;
        btn.textContent = '✓ Copied!';
        setTimeout(() => {
            btn.textContent = originalText;
        }, 2000);
    });
}

/**
 * Download roadmap as PDF (placeholder)
 */
function downloadAsJSON() {
    const jobTitle = document.getElementById('roadmapJobTitle').textContent;
    alert('📥 PDF export coming soon!\n\nFor now, you can copy the roadmap and save it as a document.');
}

/* ==================== SCROLL TO ROADMAP ==================== */
/**
 * Smooth scroll to roadmap section
 */
function scrollToRoadmap() {
    const roadmapSection = document.getElementById('roadmapOutput');
    roadmapSection.scrollIntoView({ behavior: 'smooth', block: 'start' });
}

/* ==================== DEVELOPER CONSOLE ==================== */
/**
 * Setup developer console for DSA console-based version
 */
function setupDevConsole() {
    // Toggle console with Ctrl+Shift+D
    document.addEventListener('keydown', (e) => {
        if (e.ctrlKey && e.shiftKey && e.code === 'KeyD') {
            e.preventDefault();
            devConsoleEl.classList.toggle('active');
        }
    });

    // Close button
    closeConsole.addEventListener('click', () => {
        devConsoleEl.classList.remove('active');
    });

    // Console input handler
    consoleInput.addEventListener('keypress', (e) => {
        if (e.key === 'Enter') {
            const jobTitle = consoleInput.value.trim().toLowerCase();
            consoleInput.value = '';

            if (jobTitle) {
                handleConsoleInput(jobTitle);
            }
        }
    });

    // Initial message
    addConsoleLine('Welcome to Reverse Resume Console (DSA Version)', 'info');
    addConsoleLine('Type a job title to generate a text-based roadmap', 'info');
    addConsoleLine('Available: ai engineer, full stack developer, data scientist, etc.', 'info');
}

/**
 * Handle console input and generate text-based roadmap
 * @param {string} jobTitle - Job title to process
 */
function handleConsoleInput(jobTitle) {
    addConsoleLine(`$ reverse-resume generate "${jobTitle}"`);

    const data = roadmapData[jobTitle];

    if (!data) {
        addConsoleLine(`Error: Job title "${jobTitle}" not found.`, 'error');
        addConsoleLine('Try: ai engineer, full stack developer, data scientist...', 'info');
        return;
    }

    addConsoleLine(`\n========== ${data.title.toUpperCase()} ==========`, 'info');
    addConsoleLine(`Timeline: ${data.timeline}`, 'info');

    addConsoleLine('\n[SKILLS]');
    data.skills.slice(0, 5).forEach(skill => {
        addConsoleLine(`  ${skill.name} (${skill.category})`);
    });
    if (data.skills.length > 5) {
        addConsoleLine(`  ... and ${data.skills.length - 5} more skills`);
    }

    addConsoleLine('\n[COURSES]');
    data.courses.slice(0, 3).forEach(course => {
        const type = course.free ? '[FREE]' : '[PAID]';
        addConsoleLine(`  ${type} ${course.name} (${course.platform})`);
    });

    addConsoleLine('\n[PROJECTS]');
    data.projects.slice(0, 3).forEach(project => {
        addConsoleLine(`  [${project.difficulty.toUpperCase()}] ${project.name}`);
    });

    addConsoleLine(`\n✓ Roadmap generated successfully!`);
}

/**
 * Add line to console output
 * @param {string} text - Text to display
 * @param {string} type - Message type (default, error, info)
 */
function addConsoleLine(text, type = 'default') {
    const line = document.createElement('div');
    line.className = `console-line console-${type}`;
    line.textContent = text;
    consoleOutput.appendChild(line);
    consoleOutput.scrollTop = consoleOutput.scrollHeight;
}

/* ==================== UTILITY FUNCTIONS ==================== */
/**
 * Note: All major functions are documented above.
 * This application is fully functional with vanilla JavaScript.
 */

// Restore last searched job from localStorage
window.addEventListener('load', () => {
    const lastJob = localStorage.getItem('lastJob');
    if (lastJob) {
        jobInput.value = lastJob;
    }
});
