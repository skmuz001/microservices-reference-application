# coding: utf-8

from __future__ import absolute_import
from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from promotionservice.models.base_model_ import Model
from promotionservice import util


class PromotionErrorResponse(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, status_code=None, message=None):  # noqa: E501
        """PromotionErrorResponse - a model defined in OpenAPI

        :param status_code: The status_code of this PromotionErrorResponse.  # noqa: E501
        :type status_code: int
        :param message: The message of this PromotionErrorResponse.  # noqa: E501
        :type message: str
        """
        self.openapi_types = {
            'status_code': int,
            'message': str
        }

        self.attribute_map = {
            'status_code': 'statusCode',
            'message': 'message'
        }

        self._status_code = status_code
        self._message = message

    @classmethod
    def from_dict(cls, dikt) -> 'PromotionErrorResponse':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The PromotionErrorResponse of this PromotionErrorResponse.  # noqa: E501
        :rtype: PromotionErrorResponse
        """
        return util.deserialize_model(dikt, cls)

    @property
    def status_code(self):
        """Gets the status_code of this PromotionErrorResponse.

        Non zero error code  # noqa: E501

        :return: The status_code of this PromotionErrorResponse.
        :rtype: int
        """
        return self._status_code

    @status_code.setter
    def status_code(self, status_code):
        """Sets the status_code of this PromotionErrorResponse.

        Non zero error code  # noqa: E501

        :param status_code: The status_code of this PromotionErrorResponse.
        :type status_code: int
        """

        self._status_code = status_code

    @property
    def message(self):
        """Gets the message of this PromotionErrorResponse.

        Error message  # noqa: E501

        :return: The message of this PromotionErrorResponse.
        :rtype: str
        """
        return self._message

    @message.setter
    def message(self, message):
        """Sets the message of this PromotionErrorResponse.

        Error message  # noqa: E501

        :param message: The message of this PromotionErrorResponse.
        :type message: str
        """

        self._message = message