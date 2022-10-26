Graphql URL: http://localhost:8080/graphql
Updated custom URL: http://localhost:8080/student-service/app-ui 

Queries:

mutation {
createStudent(
createStudentRequest: {
firstName: "Akash"
lastName: "Shelke"
email: "asf@gmail.com"
street: "14"
city: "Bhilai"
subjectsLearning: [
{ subjectName: "Java", marksObtained: 100 }
{ subjectName: "Spring", marksObtained: 100 }
]
}
) {
id
firstName
lastName
email
street
city
learningSubjects {
id
subjectName
marksObtained
}
}
}


query {
getStudent(id: 1) {
id
firstName
lastName
email
city
learningSubjects(subjects: ["Java", "MySQL"]) {
id
subjectName
marksObtained
}
}
}


query {
getStudent(id: 3) {
id
firstName
lastName
email
city
learningSubjects(subjectNameFilter: All) {
id
subjectName
marksObtained
}

}
}


query {
getStudent(id: 2) {
id
firstName
lastName
email
city
learningSubjects(subjectNameFilter: Java) {
id
subjectName
marksObtained
}

}
}


query {
getStudent(id: 2) {
id
firstName
lastName
email
learningSubjects {
id
subjectName
marksObtained
}
}
}



query {
fullNameRequest(nameRequest: { firstName: "Prakash", lastName: "Shelke" })
}

query {
secondQuery
}
