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


----
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
      "name": "ad_unit_id",
      "type": "long",
      "nullable": true
    },
    {
      "name": "placement_id",
      "type": "long",
      "nullable": true
    },
    {
      "name": "external_infos",
      "type": {
        "type": "array",
        "elementType": {
          "type": "struct",
          "fields": [{
            "name": "external_info",
            "type": {
              "type": "struct",
              "fields": [{
                "name": "external_system_id",
                "type": "integer",
                "nullable": true
              },
                {
                  "name": "external_id",
                  "type": "string",
                  "nullable": true
                },
                {
                  "name": "external_system_name",
                  "type": "string",
                  "nullable": true
                },
                {
                  "name": "primary",
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
    },
    {
      "name": "external_id",
      "type": "string",
      "nullable": true
    },
    {
      "name": "price_model",
      "type": "string",
      "nullable": true
    },
    {
      "name": "price",
      "type": "float",
      "nullable": true
    },
    {
      "name": "accounting_price",
      "type": "float",
      "nullable": true
    },
    {
      "name": "budget",
      "type": {
        "type": "struct",
        "fields": [{
          "name": "budget_model",
          "type": "string",
          "nullable": true
        },
          {
            "name": "currency",
            "type": "float",
            "nullable": true
          },
          {
            "name": "impression",
            "type": "integer",
            "nullable": true
          },
          {
            "name": "order_delivery_value",
            "type": "float",
            "nullable": true
          },
          {
            "name": "sov_percentage",
            "type": "float",
            "nullable": true
          },
          {
            "name": "sop_percentage",
            "type": "float",
            "nullable": true
          },
          {
            "name": "soi_percentage",
            "type": "float",
            "nullable": true
          },
          {
            "name": "impression_cap",
            "type": "integer",
            "nullable": true
          },
          {
            "name": "estimated_impression_goal",
            "type": "integer",
            "nullable": true
          },
          {
            "name": "ongoing",
            "type": "string",
            "nullable": true
          },
          {
            "name": "on_target_impressions",
            "type": "integer",
            "nullable": true
          },
          {
            "name": "gross_impression_cap",
            "type": "integer",
            "nullable": true
          },
          {
            "name": "on_target_currency",
            "type": "float",
            "nullable": true
          },
          {
            "name": "gross_currency_cap",
            "type": "float",
            "nullable": true
          },
          {
            "name": "demographic",
            "type": "integer",
            "nullable": true
          },
          {
            "name": "data_source",
            "type": "string",
            "nullable": true
          }
        ]},
      "nullable": true
    },
    {
      "name": "status",
      "type": "string",
      "nullable": true
    },
    {
      "name": "type",
      "type": "string",
      "nullable": true
    },
    {
      "name": "regulated_display",
      "type": "string",
      "nullable": true
    }
  ]
}
