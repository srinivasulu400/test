ccc
{
  "type": "struct",
  "fields": [{
    "name": "id",
    "type": "long",
    "nullable": true
  },
    {
      "name": "name",
      "type": "string",
      "nullable": true
    },
    {
      "name": "description",
      "type": "string",
      "nullable": true
    },
    {
      "name": "status",
      "type": "string",
      "nullable": true
    },
    {
      "name": "created_at",
      "type": "timestamp",
      "nullable": true
    },
    {
      "name": "custom_targeting",
      "type": {
        "type": "struct",
        "fields": [{
          "name": "include",
          "type": {
            "type": "struct",
            "fields": [{
              "name": "relation_between_sets",
              "type": "string",
              "nullable": true
            },
              {
                "name": "sets",
                "type": {
                  "type": "array",
                  "elementType": {
                    "type": "struct",
                    "fields": [{
                      "name": "set",
                      "type": {

                        "type": "struct",
                        "fields": [{
                          "name": "key_value",
                          "type": {
                            "type": "array",
                            "elementType": "string",
                            "containsNull": true
                          },
                          "nullable": true
                        },
                          {
                            "name": "relation_in_set",
                            "type": "string",
                            "nullable": true
                          }
                        ]
                      },
                      "nullable": true
                    }]
                  },
                  "containsNull": true
                },
                "nullable": true
              }
            ]
          },
          "nullable": true
        },
          {
            "name": "exclude",
            "type": {
              "type": "struct",
              "fields": [{
                "name": "key_value",
                "type": {
                  "type": "array",
                  "elementType": "string",
                  "containsNull": true
                },
                "nullable": true
              }]
            },
            "nullable": true
          }
        ]
      },
      "nullable": true
    },
    {
      "name": "loaded_at",
      "type": "timestamp",
      "nullable": true
    }
  ]
}
