Graphql URL: http://localhost:8080/graphql
Updated custom URL: http://localhost:8080/student-service/app-ui 

Queries:

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
