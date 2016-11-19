#import <Foundation/Foundation.h>
#import "ASPObject.h"

/**
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */

#import "ASPResourceUriElement.h"
#import "ASPResourceUri.h"


@protocol ASPSlides
@end

@interface ASPSlides : ASPObject


@property(nonatomic) NSArray<ASPResourceUriElement>* slideList;

@property(nonatomic) ASPResourceUri* selfUri;

@property(nonatomic) NSArray<ASPResourceUri>* alternateLinks;

@property(nonatomic) NSArray<ASPResourceUri>* links;

@end