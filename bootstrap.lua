#!/usr/bin/env lua

function replaceVariableInFile(pattern, substitution, filepath)
    local file = io.open(filepath)
    local contents
    if _VERSION == "Lua 5.3" then
        contents = file:read("a")
    else
        contents = file:read("*a")
    end
    file:close()

    contents = contents:gsub(pattern, substitution)

    file = io.open(filepath, "w")
    file:write(contents)
    file:close()
end

function replaceVariableInFiles(pattern, substitution)
    replaceVariableInFile(pattern, substitution, "./README.md")

    replaceVariableInFile(pattern, substitution, "./app/build.gradle")
    replaceVariableInFile(pattern, substitution, "./app/src/androidTest/java/PROJECT_TLD/PROJECT_DOMAIN/PROJECT_NAME/IdentityBehaviourTest.java")
    replaceVariableInFile(pattern, substitution, "./app/src/main/java/PROJECT_TLD/PROJECT_DOMAIN/PROJECT_NAME/MainActivity.java")
    replaceVariableInFile(pattern, substitution, "./app/src/main/AndroidManifest.xml")
end

io.write("Enter project name: ")
local PROJECT_NAME = io.read()
replaceVariableInFiles("PROJECT_NAME", PROJECT_NAME)

io.write("Enter short description: ")
local PROJECT_SHORT_DESCRIPTION = io.read()
replaceVariableInFiles("PROJECT_SHORT_DESCRIPTION", PROJECT_SHORT_DESCRIPTION)

io.write("Enter author name: ")
local PROJECT_AUTHOR = io.read()
replaceVariableInFiles("PROJECT_AUTHOR", PROJECT_AUTHOR)

io.write("Enter contact email: ")
local PROJECT_CONTACT_EMAIL = io.read()
replaceVariableInFiles("PROJECT_CONTACT_EMAIL", PROJECT_CONTACT_EMAIL)

io.write("Enter copyright year: ")
local PROJECT_COPY_YEAR = io.read()
replaceVariableInFiles("PROJECT_COPY_YEAR", PROJECT_COPY_YEAR)

io.write("Enter TLD: ")
local PROJECT_TLD = io.read()
replaceVariableInFiles("PROJECT_TLD", PROJECT_TLD)

io.write("Enter Domain: ")
local PROJECT_DOMAIN = io.read()
replaceVariableInFiles("PROJECT_DOMAIN", PROJECT_DOMAIN)

os.rename("./app/src/main/java/PROJECT_TLD/PROJECT_DOMAIN/PROJECT_NAME", "./app/src/main/java/PROJECT_TLD/PROJECT_DOMAIN/" .. PROJECT_NAME)
os.rename("./app/src/main/java/PROJECT_TLD/PROJECT_DOMAIN", "./app/src/main/java/PROJECT_TLD/" .. PROJECT_DOMAIN)
os.rename("./app/src/main/java/PROJECT_TLD", "./app/src/main/java/" .. PROJECT_TLD)

os.rename("./app/src/androidTest/java/PROJECT_TLD/PROJECT_DOMAIN/PROJECT_NAME", "./app/src/androidTest/java/PROJECT_TLD/PROJECT_DOMAIN/" .. PROJECT_NAME)
os.rename("./app/src/androidTest/java/PROJECT_TLD/PROJECT_DOMAIN", "./app/src/androidTest/java/PROJECT_TLD/" .. PROJECT_DOMAIN)
os.rename("./app/src/androidTest/java/PROJECT_TLD", "./app/src/androidTest/java/" .. PROJECT_TLD)

os.remove("./bootstrap.lua")
