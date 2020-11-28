# Hormone_Tracker

Unit 8: Group Milestone
===

## Table of Contents
1. [Overview](#Overview)
1. [Product Spec](#Product-Spec)
1. [Wireframes](#Wireframes)

## Overview
### Description
Tracker used to document hormone dosage taken per day/week, document symptoms as they occur and can be used to share them with your provider. This is for anyone transitioning or just taking additional hormones

### App Evaluation
- **Category:** Medical
- **Mobile:** This app would be primarily developed for mobile but would perhaps be just as viable on a computer. Functionality wouldn't be limited to mobile devices, however mobile version could potentially have more features.
- **Story:** The user can input changes that they see happen as they take hormones
- **Market:** Any individual taking hormones could choose to use this app.
- **Habit:** This app could be used as often or unoften as the user wanted depending on hormone usage.
- **Scope:** First I want to start with a calendar view, and the user can fill in symptoms on the current day.

## Product Spec
### 1. User Stories (Required and Optional)

**Required Must-have Stories**

- [x] *User can register for an account
- [] *User can login to account
- [] *User can tap on any day and add/remove symptoms
- [] *User can tap on any day and add/remove notes

**Optional Nice-to-have Stories**

- [] *User can add a picture in a note, in case they want to track their changes via photos
- [] *User can use app without logging in
- [] *There will be an anylsis tab that will list helpful tips and links
- [] *Have a Discovery tab that will allow users to see others and their symptoms

### 2. Screen Archetypes

* Login 
* Register - User signs up or logs into their account
* Calendar Screen - Calendar view of the current month
   * This will be the main screen for the user once they login
* Profile Screen 
   * Allows user to upload a photo and fill in information that pertains to them
* Creation Screen
   * Allows user create a new note or symptom and add it to a day

### 3. Navigation

**Tab Navigation** (Tab to Screen)
* Calendar
* Profile
* Track

Optional:
* Analysis
* Discovery

**Flow Navigation** (Screen to Screen)
* Forced Log-in -> Account creation if no log in is available
* Calendar screen -> Creation screen to add/remove changes -> Calendar screen
* Profile -> Text field to be modified.

## Wireframes
<img src="https://github.com/Xxyumi-hub/Hormone_Tracker/blob/main/Codepath_hormoneWireframe.JPG" width=800><br>

## Schema

# Models

# Calendar
|Property |	 Type	 |  Description                 |             
|---------|--------|------------------------------|
|objectId | String | unique id for the user       |
|notes	  | String |notes that user can adjust    |
|symptoms |	String |symptoms that user can adjust |
|updatedAt|DateTime|date when information is added|

# Networking
- Calendar Screen
  - (Read/GET) Current month calendar
  - (Create) Create a new symptom/note
  - (Delete) Delete existing symptom/note

- Creation Screen
  - (Create) Create a new symptom/note

- Profile Screen 
  - (Read/GET) Query logged in user object
  
 # Current Progress
 <img src="https://github.com/Xxyumi-hub/HormoneTracker/blob/master/gif1_progress.gif">
  
