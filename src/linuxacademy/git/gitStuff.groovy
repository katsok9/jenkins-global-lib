package linuxacademy.git

def gitcommit(gitPath){
  return  "/bin/git --git-dir=${gitPath} rev-parse HEAD".execute().text
}