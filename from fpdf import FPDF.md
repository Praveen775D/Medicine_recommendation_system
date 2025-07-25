from fpdf import FPDF

# Create a PDF class
class PDF(FPDF):
    def header(self):
        # Title
        self.set_font("Arial", "B", 14)
        self.cell(0, 10, "Assignment", ln=True, align="L")
        # Roll No on the top-right corner
        self.set_font("Arial", "", 12)
        self.cell(0, 10, "Roll No: 22AG5A6609", ln=True, align="R")
        self.ln(5)

    def chapter_title(self, title):
        self.set_font("Arial", "B", 12)
        self.multi_cell(0, 10, title)
        self.ln(1)

    def chapter_body(self, body):
        self.set_font("Arial", "", 11)
        self.multi_cell(0, 8, body)
        self.ln()

# Create PDF object
pdf = PDF()
pdf.set_auto_page_break(auto=True, margin=15)
pdf.add_page()

# Define content
qa_list = [
    ("1. What are the reasons for stress in an organization?",
     """Stress in an organization refers to the physical and emotional response that occurs when an employee feels a mismatch between the demands of their job and the resources they have to meet those demands.

1. Work Overload - More work than manageable leads to burnout.
2. Role Ambiguity - Unclear job responsibilities cause anxiety.
3. Role Conflict - Conflicting demands cause emotional stress.
4. Lack of Control - No autonomy reduces motivation.
5. Poor Work Environment - Physically or socially unpleasant environments.
6. Interpersonal Conflicts - Disagreements or lack of trust among employees.
7. Job Insecurity - Fear of job loss causes mental pressure.
8. Career Development Issues - Frustration due to lack of growth.
9. Work-Life Imbalance - Stress from juggling work and personal life.
10. Organizational Change - Resistance to new systems and uncertainty.

Conclusion: Identifying stressors helps organizations support their employees and improve well-being."""),

    ("2. Define the concept of conflict management and explain the types of conflict.",
     """Conflict management is the process of handling and resolving conflicts constructively. It involves reducing the negative impact of conflict while promoting learning and growth.

Types of conflict:
1. Interpersonal - Between individuals.
2. Intrapersonal - Within oneself.
3. Intragroup - Within a group.
4. Intergroup - Between groups or departments.
5. Organizational - Arising from structure or policies.
6. Strategic - Between top-level decisions or plans.
7. Task - Related to what needs to be done.
8. Process - About how tasks are executed.

Conclusion: Effective conflict management improves cooperation, innovation, and a healthy work environment."""),

    ("3. Explain briefly the strategies to improve the flow of communication",
     """Effective communication is essential for teamwork and organizational success. Strategies include:

1. Encourage Open Communication - Two-way dialogues build trust.
2. Use the Right Channels - Choose based on message type.
3. Simplify the Message - Avoid jargon; be clear.
4. Promote Active Listening - Pay full attention and respond.
5. Use Technology - Tools like emails, chats, video calls.
6. Provide Feedback - Allow employees to voice opinions.
7. Interdepartmental Communication - Foster cross-functional collaboration.
8. Training - Improve communication skills through programs.
9. Clear Objectives - Define roles and goals clearly.
10. Upward Communication - Let employees express concerns.

Conclusion: These strategies help reduce misunderstandings and enhance team efficiency."""),

    ("4. How does punishment differ from negative reinforcement?",
     """Punishment and negative reinforcement are both used to modify behavior, but they serve opposite purposes.

Punishment:
- Aims to decrease unwanted behavior.
- Introduces negative consequences.
- Example: A fine for being late.

Negative Reinforcement:
- Aims to increase desired behavior.
- Removes unpleasant conditions.
- Example: Avoiding a warning by completing work on time.

Difference Summary:
Punishment stops bad behavior, while negative reinforcement encourages good behavior by removing discomfort.

Conclusion: Understanding these helps managers influence behavior effectively."""),

    ("5. Bring out the differences between referent power and expert power",
     """Referent power comes from admiration or personal charisma, while expert power is based on knowledge and skills.

Referent Power:
- Based on personality and likeability.
- People follow due to respect.
- Example: Charismatic leader.

Expert Power:
- Based on competence and expertise.
- People follow due to trust in ability.
- Example: Technical expert.

Difference Summary:
Referent power is emotional and relational; expert power is rational and skill-based.

Conclusion: A good leader may use both to influence others and drive results."""),

    ("6. What is decision making? Explain briefly about Participative decision making techniques",
     """Decision making is the process of identifying and choosing the best course of action among several alternatives to achieve a desired objective. It is a vital managerial function that affects all levels of an organization and plays a crucial role in planning, problem-solving, and goal achievement.

Participative Decision Making (PDM) is a management technique where employees at various levels are involved in the decision-making process. It emphasizes collaboration, teamwork, and shared responsibility. This approach improves commitment, morale, and quality of decisions.

Techniques of Participative Decision Making:

1. Brainstorming:
   - Group members suggest ideas freely.
   - Encourages creativity and avoids criticism.
2. Delphi Technique:
   - Collects expert opinions anonymously in several rounds.
   - Responses are refined through feedback.
3. Nominal Group Technique (NGT):
   - Individuals write down ideas independently.
   - Ideas are discussed and voted on.
4. Quality Circles:
   - Small groups of workers meet regularly to discuss work-related problems.
   - Promotes continuous improvement and employee involvement.
5. Surveys and Feedback Forms:
   - Collect opinions from a large number of employees.
   - Useful for strategic or policy decisions.
6. Open-Door Policy:
   - Encourages employees to directly approach managers with suggestions.

Conclusion: Participative Decision Making leads to better decisions, stronger teamwork, and increased employee satisfaction. It aligns individual goals with organizational objectives and creates a more inclusive work environment.""")
]

# Add content to the PDF
for question, answer in qa_list:
    pdf.chapter_title(question)
    pdf.chapter_body(answer)

# Save the PDF
pdf_path = "/mnt/data/Organizational_Behaviour_Assignment_22AG5A6609.pdf"
pdf.output(pdf_path)

pdf_path
