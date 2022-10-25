Graphql URL: http://localhost:8080/graphql
Updated custom URL: http://localhost:8080/student-service/app-ui 

Queries:

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
