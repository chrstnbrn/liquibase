package liquibase.extension.testing.command

CommandTests.define {
    command = ["validate"]
    signature = """
Short Description: Validate the changelog for errors
Long Description: NOT SET
Required Args:
  changelogFile (String) The root changelog
  url (String) The JDBC database connection URL
Optional Args:
  password (String) Password to use to connect to the database
    Default: null
  username (String) Username to use to connect to the database
    Default: null
"""

    run {
        arguments = [
                changelogFile: "changelogs/hsqldb/complete/simple.changelog.xml"
        ]

        expectedResults = [
                statusMessage: "Successfully executed validate",
                statusCode   : 0
        ]
    }
}
