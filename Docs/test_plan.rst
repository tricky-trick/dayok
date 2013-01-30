********************
Project Test Plan
********************

:Owner: Oleksandr Zayats <dayok.org@gmail.com>
:Date: $Date: 2013/01/29 $
:Revision: $Revision: #1 $
:Status: Draft


Introduction
#########

This document describes strategy and activities will used during test life cycle.
Test Plan is focused on the preparation of test cases and methods of testing DayOK portal.
All components and features should be implemented as required.
Automation tests should be prepared to simplify regression testing and configuring continuous-integration development cycle.

Open issues
###########

	* IE browser compatibility

Test Goals
##########

The main goal to cover existing functionality and automate routine test cases for regression testing needs.

The general things should be covered:

	* User functionality (front end)
	* Customer functionality (back end)
	* Roles and permissions
	* User Interface usability
	* Database Performance
	
Test strategy/methodology
#########################

QA will use different methods of testing to make sure that all features are implemented correctly.

Functional Testing
==================

Functional testing will be provided to verify that all functional requirements are implemented properly. Functional tests will cover all features were implemented.
Also text content syntax check should be included in this section.

Security testing
================

Security testing will include the next points:

 - Backend page is working under HTTPs protocol only on all browsers
 - Every role has proper set of features according to this role
 - SQL injections
 - Password weakness detection

Regression Testing
================== 

Regression testing should be covered by automation completely.

Automation testing
===================

QA will use Selenium Webdriver and Java to automate those part of functionality is routine for testing or need regression testing after implementation new changes.
The features can be covered by automation tests:

 - Login / logout to Backend page
 - Content and forms validation 
 - Verification system exception
 - URL verification

Compatibility testing
=====================

QA should verify that main functionality works according to requirements in the next Web Browsers:

 - Firefox (the last versions)
 - Chrome
 - Safari


Main page elements
##################

Key Test Cases
===============

Automated test cases
=====================

Defects
========



Brand list page 
###############

Key Test Cases
===============

Automated test cases
=====================

Defects
=======


Brand page 
###########

Key Test Cases
===============

Automated test cases
=====================

Defects
=======



Backend page 
#############

Key Test Cases
===============

Automated test cases
=====================

Defects
=======


Bugs Scrub
##########

N/A

Risk Analyses and Risk Assessment (Per Feature)
###############################################

	- Performance issues. We don't have any performance reports. Should be investigated (load and stress testing).
	- Browsers incompatibility. QA should run accurate testing at all required browsers. IE browser compatibility is open issue.
	- Security issues. QA should make sure that all data are encrypted under SSL protocol on the Backend portal.
	- QA should make sure that portal is working as expected under mobile browsers (Android OS, IOS). Any?
	
Additional Tools
################

 - GITHub - SVN tool, is a web-based hosting service for software development projects that use the Git revision control system..
 - JMeter - The Apache JMeter desktop application to test performance. It can be used to simulate a heavy load on a server, network or object to test its strength or to analyze overall performance under different load types
 - XSpider - security scanner. Services and ports identification. Web content analyzing. Password weakness detection.
 - Notepad++ - is a free source code editor and Notepad replacement that supports several languages. Running in the MS Windows environment, its use is governed by GPL License.
 - Eclipse - is a multi-language software development environment comprising a workspace and an extensible plug-in system.
 - JDK - The Java Development Kit is an implementation of either one of the Java SE, Java EE or Java ME platforms released by Oracle Corporation in the form of a binary product aimed at Java developers on Solaris, Linux, Mac OS X or Windows.
 - Dropbox - is a file hosting service operated by Dropbox, Inc., that offers cloud storage, file synchronization, and client software.
 - Skype, google gabber, etc - simple messangers.
	
Test Automation
###############
	
Selenium Webdriver is the best choice to automate the next things:

 - To validate the set of functionality on Backend for user with different access
 - Check the links
 - Check the forms (comments, search, etc)
	
Acceptance Criteria
###################

Tests to be run by Dev team during the hand-off
===============================================

Developers should show correct features functionality:

 - Main page can be accessed
 - Page formatting isn't corrupted. Default functionality is available
 - Every type of user (roles) can be logged in with correct credentials to Backend

Contact persons
###############

Oleksandr Zayats <alexandr.zayats@gmail.com>
Denis Zaiats <denis.zayats@gmail.com>