def call(){
  sh "echo Hello Wordddd"
}

def Helper(Map con = [:]){
  sh "echo Your full name is  ${con.fname}  ${con.lname}"
  
}

