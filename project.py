student_grades = {}

def add_student(name,grade):
    student_grades[name] = grade
    print(f"Student {name} added with grade {grade}.")

def update_student(name,grade):
    if name in student_grades:
        student_grades[name] = grade
        print(f"Grade for student {name} updated to {grade}.")
    else:
        print(f"Student {name} not found.")

def delete_student(name):
    if name in student_grades:
        del student_grades[name]
        print(f"Student {name} deleted.")
    else:
        print(f"Student {name} not found.")

def view_students():
    print("Students List:")
    if student_grades:
        for name, grade in student_grades.items():
            print(f"Name: {name}, Grade: {grade}")
    else:
        print("No students found.")

def main():
    while True:
        print('\n Student Management System\n1. Add Student\n2. Update Student\n3. Delete Student\n4. View Students\n5. Exit\n')

        choice = int(input("Enter your choice: "))
        if choice == 1:
            name = input("Enter student name: ")
            grade = input("Enter student grade: ")
            add_student(name, grade)
        elif choice == 2:
            name = input("Enter student name: ")
            grade = input("Enter student grade: ")
            update_student(name, grade)
        elif choice == 3:
            name = input("Enter student name: ")
            delete_student(name)
        elif choice == 4:
            view_students()
        elif choice == 5:
            break
        else:
            print("Invalid choice. Please try again.")

main()